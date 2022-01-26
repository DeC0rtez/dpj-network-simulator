package net.sim;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for representing the Switch Device
 * @author Artem Pyatigorov & Daniel De Corte
 */
// Though in real networking switches do not use IP addresses, the simulator acts as if they do for simplicity
public class Switch extends Device {

    // Switch information
    /**
     * DEPRECIATED
     */
    public Map<String, String> wiredConnections = new HashMap<>();

    public Map<String, String> camTable = new HashMap<>();

    // CAM table methods

    /**
     * Add route to cam table
     * @param packetDestination
     * @param nextHop
     */
    public void addRoute(String packetDestination, String nextHop) {
        camTable.put(packetDestination, nextHop);
    }

    /**
     * Remove route from cam table
     * @param packetDestination
     */
    public void delRoute(String packetDestination) {
        camTable.remove(packetDestination);
    }

    /**
     * Print cam table
     */
    public void showCamTable() {
        System.out.println(this.id + " CAM table: ");
        camTable.forEach((packetDestination,nextHop)-> System.out.println("destination: " + packetDestination + " next hop: " + nextHop));
    }

    // Wired connection methods

    /**
     * DEPRECIATED, Handled by Device
     * @param connectedDeviceID
     * @param connectedDeviceIP
     */
    public void addConnection(String connectedDeviceID, String connectedDeviceIP) {
        wiredConnections.put(connectedDeviceID, connectedDeviceIP);
    }

    /**
     * DEPRECIATED, Handled by Device
     * @param connectedDeviceID
     */
    public void delConnection(String connectedDeviceID) {
        wiredConnections.remove(connectedDeviceID);
    }

    /**
     * DEPRECIATED, Handled by Simulation.printTopology
     */
    public void showConnections() {
        System.out.println(this.id + " wired connections: ");
        wiredConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // IP methods

    /**
     * Set IP Address
     * @param IP
     */
    public void setIPAddress(String IP) {
        this.ipAddress = new IPAddress(IP);
    }

    /**
     * Print IP
     */
    public void showIP() {
        System.out.println("Device " + id + " IP is: " + this.ipAddress.ipStr);
    }

    // Constructor
    public Switch(NetworkLayer _layer, DeviceType _type, int deviceID, IPAddress _ipAddress) {
        super(_layer, _type, deviceID, _ipAddress);
    }

    // handleEvent override
    @Override
    public void handleEvent(Event e) {

    }
}
// Artem Pyatigorov & Daniel De Corte