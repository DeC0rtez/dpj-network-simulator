package net.sim;
//Vlad
public class EthernetConnection extends Connection{
    public int id;
    public Device device1;
    public Device device2;
    public ConnectionType type;
    public float failureRate;
    public int speed;


    public EthernetConnection(Device _device1, Device _device2, int id, ConnectionType _type) {
        super(_device1, _device2, id, _type);
        device1 = _device1;
        device2 = _device2;
        this.id = id;
        type = _type;
        speed = 100;
    }

    public IPAddress getDevice1IP()
    {
        IPAddress ipAddress = device1.ipAddress;
        return ipAddress;

    }

    public IPAddress getDevice2IP()
    {
        IPAddress ipAddress = device2.ipAddress;
        return ipAddress;

    }

    @Override
    public void handleEvent(Event e) {
    }


}
