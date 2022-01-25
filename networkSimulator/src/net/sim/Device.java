package net.sim;

public abstract class Device implements EventHandler {
    public int id = 0;
    public NetworkLayer layerStack;
    public DeviceType type;
    public IPAddress ipAddress;

    public Device(NetworkLayer _layer, DeviceType _type, int _deviceID, IPAddress _ip){
        id = _deviceID;
        layerStack = _layer;
        type = _type;
        ipAddress = _ip;
    }
    public Connection createConnectionFromDevice(int connectionId, ConnectionType connectionType, Device deviceTo){
        return ConnectionFactory.createConnection(connectionType, connectionId, this, deviceTo);
    }
}
// Nikita Druzhkov
