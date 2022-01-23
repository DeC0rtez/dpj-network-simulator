package net.sim;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * This class is a superstructure for the simulation
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
    private DeviceFactory deviceFactory = new DeviceFactory();
    private ConnectionFactory connectionFactory = new ConnectionFactory();

    /**
     * Creates a Device using DeviceFactory and adds it to Devices
     * @param deviceType Type of device to be created, see DeviceType
     */
    public void addDevice(DeviceType deviceType){
        int id = getNewDeviceID();
        Device device = deviceFactory.createDevice(deviceType, id);
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
     * Creates a Connection using ConnectionFactory and adds it to Connections
     * @param device1 Reference to one of the devices being connected
     * @param device2 Reference to the other device being connected
     * @param connectionType Type of connection to be created, see ConnectionType
     */
    public void addConnection(Device device1, Device device2, ConnectionType connectionType){
        int id = getNewConnectionID();
        Connection connection = connectionFactory.createConnection(connectionType, id, device1, device2);
        connections.put(id, connection);
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



}
