package net.sim;

import java.util.HashMap;
import java.util.Map;

public abstract class Router extends Device{

    public String IPAddress;
    public Map<String, String> wiredConnections = new HashMap<>();
    public Map<String, String> routingTable = new HashMap<>();

    public void addRoute(String packetDestination, String nextHop) {
        routingTable.put(packetDestination, nextHop);
    }

    public void delRoute(String packetDestination) {
        routingTable.remove(packetDestination);
    }

    public void addConnection(String connectedDeviceID, String connectedDeviceIP) {
        wiredConnections.put(connectedDeviceID, connectedDeviceIP);
    }

    public void delConnection(String connectedDeviceID) {
        wiredConnections.remove(connectedDeviceID);
    }


    public Router(NetworkLayer _layer, DeviceType _type, int deviceID) {
        super(_layer, _type, deviceID);
    }
}
// Daniel De Corte