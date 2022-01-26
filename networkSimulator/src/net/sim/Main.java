package net.sim;
public class Main {

    public static void main(String[] args) {
        Simulation testSimulation = new Simulation(); //Initialize a simulation environment
        testSimulation.addDevice(DeviceType.ROUTER, new IPAddress("1.1.1.1")); //Add a device to the simulation
        testSimulation.addDevice(DeviceType.COMPUTER, new IPAddress("1.1.1.2"));
        Device d = testSimulation.getDeviceByID(0); //Get the first device added
        Device d1 = testSimulation.getDeviceByID(1); //Get the second device added
        System.out.println(d.type);  //Check type of device
        testSimulation.addConnection(d, d1, ConnectionType.ETHERNET); //Make a connection between the two devices
        testSimulation.printTopology(); //Print the stored topology
        testSimulation.scheduleEvent(new SimplePingEvent(d, 0)); //Schedule a new event
        testSimulation.tick(); //Get the next event and perform it

    }
}
