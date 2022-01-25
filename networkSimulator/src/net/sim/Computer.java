package net.sim;

import java.util.HashMap;
import java.util.Map;

public class Computer extends Device {

    // Computer information
    public Map<String, String> wiredConnections = new HashMap<>();
    public Map<String, String> wirelessConnections = new HashMap<>();

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

    // All connection methods
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
        System.out.println("Device " + id + " IP is: " + this.ipAddress.ipStr);
    }

    // Constructor
    public Computer(NetworkLayer _layer, DeviceType _type, int deviceID, IPAddress _ipAddress) {
        super(_layer, _type, deviceID, _ipAddress);
    }

    // handleEvent override
    @Override
    public void handleEvent(Event e) {

    }
}
// Artem Pyatigorov & Daniel De Corte