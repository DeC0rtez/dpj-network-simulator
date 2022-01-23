package net.sim;

public abstract class Device implements EventHandler {
    public int id = 0;
    public NetworkLayer layerStack;
    public DeviceType type;
    public static int nextId = 0;

    public Device(NetworkLayer _layer, DeviceType _type){
        id = nextId;
        nextId++;
        layerStack = _layer;
        type = _type;
    }
    public Connection createConnectionFromDevice(int connectionId, ConnectionType connectionType, Device deviceTo){
        return ConnectionFactory.createConnection(connectionType, connectionId, this, deviceTo);
    }
}
// Nikita Druzhkov
