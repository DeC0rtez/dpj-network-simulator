package net.sim;

public class DeviceFactory {
    public Device createDevice(DeviceType deviceType, int newDeviceID){
        switch (deviceType){
            case WIRELESSROUTER:
                return new WirelessRouter(newDeviceID);
                break;
            case ROUTER:
                return new Router(newDeviceID);
                break;
            case SWITCH:
                return new Switch(newDeviceID);
                break;
            case COMPUTER:
                return new Computer(newDeviceID);
                break;
            default:
                return new Router(newDeviceID);
        }
    }

    //Martin Janda
}
