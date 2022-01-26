package net.sim;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * This class is a superstructure for the simulation
 * It handles requests the user can make in terms of interacting with the simulation/network
 * It contains all the components necessary to represent a network topology
 * It has all methods necessary for creating a topology
 *
 * @author Martin Janda
 *
 */
public class Simulation {
    //Martin Janda

    private Dictionary<Integer, Device> devices= new Hashtable<>(); //Contains all devices added to simulation
    private int deviceIDIncrement = 0; //Keeps track of valid device ID's
    private Dictionary<Integer, Connection> connections = new Hashtable<>(); //Contains all connections added to simulation
    private int connectionIDIncrement = 0; //Keeps track of valid connection ID's

    private EventScheduler eventScheduler;
    private DeviceFactory deviceFactory;
    private ConnectionFactory connectionFactory;

    public Simulation(){
        eventScheduler = new EventScheduler();
        deviceFactory = new DeviceFactory();
        connectionFactory = new ConnectionFactory(eventScheduler);
    }

    /**
     * Checks next scheduled event,
     * and performs it if it is defined
     * Curently all that has been defined is a SimplePingEvent
     */
    public void tick(){
        Event current = eventScheduler.next();
        if(current.type == EventType.SIMPLEPING){
            System.out.println("GOT SIMPLEPING");
            SimplePingEvent x = (SimplePingEvent) current;
            getDeviceByID(x.id).handleSimplePing(x);
        }
    }

    /**
     * Add a device to the simulation
     * Creates a Device using DeviceFactory and adds it to Devices
     * @param deviceType Type of device to be created, see DeviceType
     */
    public void addDevice(DeviceType deviceType, IPAddress ip){
        int id = getNewDeviceID();
        Device device = deviceFactory.createDevice(deviceType, id, ip);
        devices.put(id, device);
    }

    /**
     * Returns an integer for a new and unique deviceID
     * Increments deviceIDIncrement to keep track of ID's that have already been used
     * @return
     */
    public int getNewDeviceID(){
        return deviceIDIncrement++;
    }

    /**
     * Add a connection to the simulation
     * Creates a Connection using ConnectionFactory and adds it to Connections
     * @param device1 Reference to one of the devices being connected
     * @param device2 Reference to the other device being connected
     * @param connectionType Type of connection to be created, see ConnectionType
     */
    public void addConnection(Device device1, Device device2, ConnectionType connectionType){
        int id = getNewConnectionID();
        Connection connection = connectionFactory.createConnection(connectionType, id, device1, device2);
        connections.put(id, connection);
        device1.addConnection(connection);
        device2.addConnection(connection);
    }

    /**
     * Returns an integer for a new and unique connectionID
     * Increments connectionIDIncrement to keep track of ID's that have already been used
     * @return
     */
    public int getNewConnectionID(){
        return connectionIDIncrement++;
    }

    /**
     * Used to modify the failure rate of a connection
     * @param connection Reference to a connection
     * @param chance Chance between 0-1 that the connection fails
     */
    public void addFailurePoint(Connection connection, float chance){
        if(chance <= 1){
            if (chance >= 0){
                connection.failureRate = chance;
            }
        }
    }

    /**
     * Returns a device with a matching ID from devices
     * @param id ID of the device
     * @return
     */
    public Device getDeviceByID(int id){
        return devices.get(id);
    }

    /**
     * Returns a device with a matching ID from connections
     * @param id ID of the connection
     * @return
     */
    public Connection getConnectionByID(int id){
        return connections.get(id);
    }

    /**
     * Public facing method for scheduling an event to the EventScheduler queue
     * @param event
     */
    public void scheduleEvent(Event event){
        eventScheduler.schedule(event);
    }

    /**
     * Prints the stored topology of the network simulation
     * @author Martin Janda
     */
    public void printTopology(){
        for(var i =0; i<deviceIDIncrement; i++)
        {
            System.out.println("========================");
            System.out.println();
            Device device = getDeviceByID(i);
            System.out.print("DEVICE ID : ");
            System.out.print(i);
            System.out.println();
            System.out.print("TYPE OF DEVICE: ");
            System.out.print(device.type);
            System.out.println();
            System.out.println("CONNECTIED TO: ");
            LinkedList<Connection> connections = device.connections;
            for(var c = 0; c<connections.size(); c++){
                System.out.println("++++++++");
                Connection connection = connections.get(c);
                System.out.print("    CONNECTION ID: ");
                System.out.println(connection.id);
                System.out.println();
                System.out.print("    TYPE OF CONNECTION: ");
                System.out.print(connection.type);
                System.out.println();
                System.out.print("    DEVICE1 ID: ");
                System.out.print(connection.device1.id);
                System.out.println();
                System.out.print("    DEVICE2 ID: ");
                System.out.print(connection.device2.id);
                System.out.println();
                System.out.print("    FAILURE RATE: ");
                System.out.print(connection.failureRate);
                System.out.println();

            }

        }
    }


}
