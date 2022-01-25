package net.sim;

/**
 * This class is responsible for creating connections
 *
 * @author Martin Janda
 */

public class ConnectionFactory {
    EventScheduler eventScheduler;

    /**
     * Constructor gets EventScheduler instance to pass it to connection classes
     * @param _eventScheduler reference to EventScheduler main instance
     *
     * @author Nikita Druzhkov
     */
    public ConnectionFactory(EventScheduler _eventScheduler){
        eventScheduler = _eventScheduler;
    }
    /**
     * Returns a Connection
     * @param connectionType type of connection, see ConnectionType
     * @param id ID of the connection
     * @param device1 reference to a device
     * @param device2 reference to a device
     * @return
     */
    public  Connection createConnection(ConnectionType connectionType, int id, Device device1, Device device2) {
        switch (connectionType){

            case WIRELESS:
                return new WirelessConnection(device1, device2, id, eventScheduler, this);
            default: // ETHERNET is a default connection
                return new EthernetConnection(device1, device2, id, eventScheduler, this);
        }
    }
    //Martin Janda
}
