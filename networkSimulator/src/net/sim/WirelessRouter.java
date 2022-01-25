package net.sim;

import java.util.HashMap;
import java.util.Map;

public class WirelessRouter extends Device{

    // Router information
    public Map<String, String> wiredConnections = new HashMap<>();
    public Map<String, String> wirelessConnections = new HashMap<>();
    public Map<String, String> routingTable = new HashMap<>();

    // Routing table methods
    public void addRoute(String packetDestination, String nextHop) {
        routingTable.put(packetDestination, nextHop);
    }

    public void delRoute(String packetDestination) {
        routingTable.remove(packetDestination);
    }

    public void showRoutingTable() {
        System.out.println(this.id + " Routing table: ");
        routingTable.forEach((packetDestination,nextHop)-> System.out.println("destination: " + packetDestination + " next hop: " + nextHop));
    }

    // Wired connection methods
    public void addWiredConnection(String connectedDeviceID, String connectedDeviceIP) {
        wiredConnections.put(connectedDeviceID, connectedDeviceIP);
    }
    public void delWiredConnection(String connectedDeviceID) {
        wiredConnections.remove(connectedDeviceID);
    }

    public void showWiredConnections() {
        System.out.println(this.id + " wired connections: ");
        wiredConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // Wireless connection methods
    public void addWirelessConnection(String connectedDeviceID, String connectedDeviceIP) {
        wirelessConnections.put(connectedDeviceID, connectedDeviceIP);
    }
    public void delWirelessConnection(String connectedDeviceID) {
        wirelessConnections.remove(connectedDeviceID);
    }

    public void showWirelessConnections() {
        System.out.println(this.id + " wireless connections: ");
        wirelessConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // all connection methods
    public void showAllConnections() {
        System.out.println(this.id + " wireless connections: ");
        wirelessConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
        System.out.println("-----");
        System.out.println(this.id + " wired connections: ");
        wiredConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));

    }

    // IP methods
    public void setIPAddress(String IP) {
        this.ipAddress = new IPAddress(IP);
    }

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