package net.sim;


public class EthernetConnection extends Connection{
    public float failureRate;
    public int speed;


    public EthernetConnection(Device _device1, Device _device2, int id) {
        super(_device1, _device2, id, ConnectionType.ETHERNET);
    }

    public IPAddress getDevice1IP()
    {
        IPAddress ipAddress = this.device1.ipAddress;
        return ipAddress;

    }

    public IPAddress getDevice2IP()
    {
        IPAddress ipAddress = this.device2.ipAddress;
        return ipAddress;

    }

    public void connectDevice(int connectionNumber, Device device){
        ConnectionFactory.createConnection(ConnectionType.ETHERNET, connectionNumber, this.device1, this.device2);
    }
}

//Vlad
