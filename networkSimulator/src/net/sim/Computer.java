package net.sim;

import java.util.HashMap;
import java.util.Map;

/**
 * This device is used to represent a computer/end user device
 *
 * @author Artem Pyatigorov & Daniel De Corte
 */
public class Computer extends Device {

    // Computer information
    /**
     * wiredConnections DEPRECIATED
     */
    public Map<String, String> wiredConnections = new HashMap<>();
    /**
     * wirelessConnections DEPRECIATED
     */
    public Map<String, String> wirelessConnections = new HashMap<>();

    // Wired connection methods

    /**
     * Method for adding a wired connection
     * SHOULD NOT BE USED, instead use Device.addConnection()
     * @param connectedDeviceID
     * @param connectedDeviceIP
     */
    public void addWiredConnection(String connectedDeviceID, String connectedDeviceIP) {
        wiredConnections.put(connectedDeviceID, connectedDeviceIP);
    }

    /**
     * Method for removing a wired connection
     * SHOULD NOT BE USED as the datastructures being referenced are depreciated
     * @param connectedDeviceID
     */
    public void delWiredConnection(String connectedDeviceID) {
        wiredConnections.remove(connectedDeviceID);
    }

    /**
     *  Method for showing wired connections
     * SHOULD NOT BE USED as the datastructures being referenced are depreciated
     * TO VIEW CONNECTIONS USE Simulation.printTopology()
     */
    public void showWiredConnections() {
        System.out.println(this.id + " wired connections: ");
        wiredConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // Wireless connection methods

    /**
     * Method for adding a wireless connection
     * SHOULD NOT BE USED, instead use Device.addConnection()
     * @param connectedDeviceID
     * @param connectedDeviceIP
     */
    public void addWirelessConnection(String connectedDeviceID, String connectedDeviceIP) {
        wirelessConnections.put(connectedDeviceID, connectedDeviceIP);
    }

    /**
     * Method for removing a wireless connection
     * SHOULD NOT BE USED as the datastructures being referenced are depreciated
     * @param connectedDeviceID
     */
    public void delWirelessConnection(String connectedDeviceID) {
        wirelessConnections.remove(connectedDeviceID);
    }

    /**
     * Method for showing wireless connections
     * SHOULD NOT BE USED as the datastructures being referenced are depreciated
     *TO VIEW CONNECTIONS USE Simulation.printTopology()
     */
    public void showWirelessConnections() {
        System.out.println(this.id + " wireless connections: ");
        wirelessConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // All connection methods

    /**
     * DEPRECIATED, use Simulation.printTopology instead
     */
    public void showAllConnections() {
        System.out.println(this.id + " wireless connections: ");
        wirelessConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
        System.out.println("-----");
        System.out.println(this.id + " wired connections: ");
        wiredConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));

    }

    // IP methods

    /**
     * Used to set the IP Address of a the device
     * @param IP
     */
    public void setIPAddress(String IP) {
        this.ipAddress = new IPAddress(IP);
    }

    /**
     * Used to print the IP Address
     */
    public void showIP() {
        System.out.println("Device " + id + " IP is: " + this.ipAddress.ipStr);
    }

    // Constructor

    /**
     * Construct Computer, Only to be used by DeviceFactory
     * Use Simulation.addDevice()
     * @param _layer
     * @param _type
     * @param deviceID
     * @param _ipAddress
     */
    public Computer(NetworkLayer _layer, DeviceType _type, int deviceID, IPAddress _ipAddress) {
        super(_layer, _type, deviceID, _ipAddress);
    }

    // handleEvent override
    @Override
    public void handleEvent(Event e) {

    }
}
// Artem Pyatigorov & Daniel De Corte