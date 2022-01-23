package net.sim;

/**
 * This class is responsible for creating connections
 */

public class ConnectionFactory {
    /**
     * Returns a Connection
     * @param connectionType type of connection, see ConnectionType
     * @param id ID of the connection
     * @param device1 reference to a device
     * @param device2 reference to a device
     * @return
     */
    public static Connection createConnection(ConnectionType connectionType, int id, Device device1, Device device2) {
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
