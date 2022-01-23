package net.sim;

/**
 * This class is responsible for creating devices
 */
public class DeviceFactory {
    /**
     * Returns a Device
     * @param deviceType Type of device, see DeviceType
     * @param newDeviceID ID of the device
     * @return
     */
    public Device createDevice(DeviceType deviceType, int newDeviceID){
        switch (deviceType){
            case WIRELESSROUTER:
                return new WirelessRouter(new NetworkLayer(), deviceType, newDeviceID);
                break;
            case ROUTER:
                return new Router(new NetworkLayer(), deviceType, newDeviceID);
                break;
            case SWITCH:
                return new Switch(new NetworkLayer(), deviceType, newDeviceID);
                break;
            case COMPUTER:
                return new Computer(new NetworkLayer(), deviceType, newDeviceID);
                break;
            default:
                return new Router(new NetworkLayer(), deviceType, newDeviceID);
        }
    }

    //Martin Janda
}
