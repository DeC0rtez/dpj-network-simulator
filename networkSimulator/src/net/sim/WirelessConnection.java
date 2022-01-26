package net.sim;
//Vlad

/**
 * Class for representing a wireless connection
 *
 * @author Vlad
 */
public class WirelessConnection extends Connection{
    public float failureRate;
    public int speed;
    public int channel;


    public WirelessConnection(Device _device1, Device _device2, int id, EventScheduler eventScheduler, ConnectionFactory _connectionFactory) {
        super(_device1, _device2, id, ConnectionType.WIRELESS, eventScheduler, _connectionFactory);
    }

    /**
     * Get IP of device1
     * @return
     */
    public IPAddress getDevice1IP()
    {
        IPAddress ipAddress = this.device1.ipAddress;
        return ipAddress;

    }

    /**
     * Get IP of device2
     * @return
     */
    public IPAddress getDevice2IP()
    {
        IPAddress ipAddress = this.device2.ipAddress;
        return ipAddress;

    }


}
