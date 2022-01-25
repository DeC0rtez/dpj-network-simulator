package net.sim;

import java.util.HashMap;
import java.util.Map;

// Though in real networking switches do not use IP addresses, the simulator acts as if they do for simplicity
public class Switch extends Device {

    // Switch information
    public Map<String, String> wiredConnections = new HashMap<>();
    public Map<String, String> camTable = new HashMap<>();

    // CAM table methods
    public void addRoute(String packetDestination, String nextHop) {
        camTable.put(packetDestination, nextHop);
    }
    public void delRoute(String packetDestination) {
        camTable.remove(packetDestination);
    }
    public void showCamTable() {
        System.out.println(this.id + " CAM table: ");
        camTable.forEach((packetDestination,nextHop)-> System.out.println("destination: " + packetDestination + " next hop: " + nextHop));
    }

    // Wired connection methods
    public void addConnection(String connectedDeviceID, String connectedDeviceIP) {
        wiredConnections.put(connectedDeviceID, connectedDeviceIP);
    }
    public void delConnection(String connectedDeviceID) {
        wiredConnections.remove(connectedDeviceID);
    }
    public void showConnections() {
        System.out.println(this.id + " wired connections: ");
        wiredConnections.forEach((connectedDeviceID,connectedDeviceIP)-> System.out.println("connected device ID: " + connectedDeviceID + " IP: " + connectedDeviceIP));
    }

    // IP methods
    public void setIPAddress(String IP) {
        this.ipAddress = new IPAddress(IP);
    }
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