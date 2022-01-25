package net.sim;

import java.util.LinkedList;

public abstract class Device implements EventHandler {
    public int id = 0;
    public NetworkLayer layerStack;
    public DeviceType type;
    public IPAddress ipAddress;
    public LinkedList<Connection> connections;

    public Device(NetworkLayer _layer, DeviceType _type, int _deviceID, IPAddress _ip) {
        id = _deviceID;
        layerStack = _layer;
        type = _type;
        ipAddress = _ip;
    }

    public  void addConnection(Connection connection){
        connections.add(connection);
    }

}
// Nikita Druzhkov
