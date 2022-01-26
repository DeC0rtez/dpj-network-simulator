package net.sim;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for representing the Router device
 *
 * @author Daniel De Corte
 */
public class Router extends Device{

    // Router information
    /**
     * DEPRECIATED
     */
    public Map<String, String> wiredConnections = new HashMap<>();

    public Map<String, String> routingTable = new HashMap<>();

    // Routing table methods

    /**
     * add route to routing table
     * @param packetDestination
     * @param nextHop
     */
    public void addRoute(String packetDestination, String nextHop) {
        routingTable.put(packetDestination, nextHop);
    }

    /**
     * Delete route from routing table
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
     * DEPRECIATED, HANDLED BY Device
     * @param connectedDeviceID
     * @param connectedDeviceIP
     */
    public void addConnection(String connectedDeviceID, String connectedDeviceIP) {
        wiredConnections.put(connectedDeviceID, connectedDeviceIP);
    }

    /**
     * DEPRECIATED, HANDLED BY Device
     * @param connectedDeviceID
     */
    public void delConnection(String connectedDeviceID) {
        wiredConnections.remove(connectedDeviceID);
    }

    /**
     * DEPRECIATED, HANDLED BY Simulation.printTopology
     */
    public void showConnections() {
        System.out.println(this.id + " wired connections: ");
        wiredConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // IP methods

    /**
     * Set IPAddress
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



    public Router(NetworkLayer _layer, DeviceType _type, int _deviceID, IPAddress _ipAddress) {
        super(_layer, _type, _deviceID, _ipAddress);
    }

    @Override
    public void handleEvent(Event e) {

    }
}
// Daniel De Corte