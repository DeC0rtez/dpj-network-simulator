package net.sim;

/**
 * This class is responsible for creating devices
 *
 * @author Martin Janda
 */
public class DeviceFactory {
    /**
     * Returns a Device
     * @param deviceType Type of device, see DeviceType
     * @param newDeviceID ID of the device
     * @return
     */

    public Device createDevice(DeviceType deviceType, int newDeviceID, IPAddress ip){
        switch (deviceType){
            case WIRELESSROUTER:
                return new WirelessRouter(new NetworkLayer(), deviceType, newDeviceID, ip);

            case SWITCH:
                return new Switch(new NetworkLayer(), deviceType, newDeviceID, ip);
            case COMPUTER:
                return new Computer(new NetworkLayer(), deviceType, newDeviceID, ip);
            default: // ROUTER is a default device
                return new Router(new NetworkLayer(), deviceType, newDeviceID, ip);
        }
    }

    //Martin Janda
}
