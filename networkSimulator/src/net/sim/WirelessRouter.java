package net.sim;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for representing the WirelessRouter device
 *
 * @author Daniel De Corte
 */
public class WirelessRouter extends Device{

    // Router information
    /**
     * DEPRECIATED
     */
    public Map<String, String> wiredConnections = new HashMap<>();
    /**
     * DEPRECIATED
     */
    public Map<String, String> wirelessConnections = new HashMap<>();

    public Map<String, String> routingTable = new HashMap<>();

    // Routing table methods

    /**
     * Add route to routing table
     * @param packetDestination
     * @param nextHop
     */
    public void addRoute(String packetDestination, String nextHop) {
        routingTable.put(packetDestination, nextHop);
    }

    /**
     * Remove route from routing table
     * @param packetDestination
     */
    public void delRoute(String packetDestination) {
        routingTable.remove(packetDestination);
    }

    /**
     * Print routing table
     */
    public void showRoutingTable() {
        System.out.println(this.id + " Routing table: ");
        routingTable.forEach((packetDestination,nextHop)-> System.out.println("destination: " + packetDestination + " next hop: " + nextHop));
    }

    // Wired connection methods

    /**
     * DEPRECIATED, Handled by Device
     * @param connectedDeviceID
     * @param connectedDeviceIP
     */
    public void addWiredConnection(String connectedDeviceID, String connectedDeviceIP) {
        wiredConnections.put(connectedDeviceID, connectedDeviceIP);
    }

    /**
     * DEPRECIATED, Handled by Device
     * @param connectedDeviceID
     */
    public void delWiredConnection(String connectedDeviceID) {
        wiredConnections.remove(connectedDeviceID);
    }

    /**
     * DEPRECIATED, Handled by Simulation.printTopology
     */
    public void showWiredConnections() {
        System.out.println(this.id + " wired connections: ");
        wiredConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // Wireless connection methods

    /**
     * DEPRECIATED, Handled by Device
     * @param connectedDeviceID
     * @param connectedDeviceIP
     */
    public void addWirelessConnection(String connectedDeviceID, String connectedDeviceIP) {
        wirelessConnections.put(connectedDeviceID, connectedDeviceIP);
    }

    /**
     * DEPRECIATED, Handled by Device
     * @param connectedDeviceID
     */
    public void delWirelessConnection(String connectedDeviceID) {
        wirelessConnections.remove(connectedDeviceID);
    }

    /**
     * DEPRECIATED, Handled by Simulation.printTopology
     */
    public void showWirelessConnections() {
        System.out.println(this.id + " wireless connections: ");
        wirelessConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // all connection methods

    /**
     * DEPRECIATED, Handled by Simulation.printTopology
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
        System.out.println("Device " + this.id + " IP is: " + this.ipAddress.ipStr);
    }


    public WirelessRouter(NetworkLayer _layer, DeviceType _type, int _deviceID, IPAddress _ipAddress) {
        super(_layer, _type, _deviceID, _ipAddress);
    }

    @Override
    public void handleEvent(Event e) {

    }
}
// Daniel De Corte