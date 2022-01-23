package net.sim;

public class ConnectionFactory {
    public Connection createConnection(ConnectionType connectionType, int id, Device device1, Device device2) {
        switch (connectionType){
            case ETHERNET:
                return new EthernetConnection(device1, device2, id);
                break;
            case WIRELESS:
                return new WirelessConnection(device1, device2, id);
                break;
            default:
                return new EthernetConnection(device1, device2, id);
                break;
        }
    }
    //Martin Janda
}
