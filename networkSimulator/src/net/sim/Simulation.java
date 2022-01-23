package net.sim;

import java.util.Dictionary;
import java.util.Hashtable;

public class Simulation {
    //Martin Janda

    private Dictionary<Integer, Device> devices= new Hashtable<>(); //Contains all devices added to simulation
    private int deviceIDIncrement = 0; //Keeps track of valid device ID's
    private Dictionary<Integer, Connection> connections = new Hashtable<>(); //Contains all connections added to simulation
    private int connectionIDIncrement = 0; //Keeps track of valid connection ID's

    private EventScheduler eventScheduler;
    private DeviceFactory deviceFactory = new DeviceFactory();
    private ConnectionFactory connectionFactory = new ConnectionFactory();


    public void addDevice(DeviceType deviceType){
        Device device = deviceFactory.createDevice(deviceType, getNewDeviceID());
    }
    public int getNewDeviceID(){
        return deviceIDIncrement++;
    }

    public void addConnection(Device device1, Device device2, ConnectionType connectionType){

    }
    public int getNewConnectionID(){
        return connectionIDIncrement++;
    }

}
