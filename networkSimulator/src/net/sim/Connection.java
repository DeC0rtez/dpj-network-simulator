package net.sim;

/**
 * Abstract representation of a connection
 *
 * @author Vlad & Nikita
 */
public abstract class Connection implements  EventHandler{
    //Vlad & Nikita
    public int id;
    public Device device1;
    public Device device2;
    public ConnectionType type;
    public float failureRate;
    public EventScheduler eventScheduler;
    public ConnectionFactory connectionFactory;
    public int speed;
    public Connection(Device _device1, Device _device2, int _id, ConnectionType _type, EventScheduler _eventScheduler, ConnectionFactory _connectionFactory){
        device1 = _device1;
        device2 = _device2;
        id = _id;
        type = _type;
        eventScheduler = _eventScheduler;
        connectionFactory = _connectionFactory;
    }
    public void handleEvent(Event e) {
        eventScheduler.schedule(e);
    }

    /**
     * Set the failure rate of a connection
     * @param failureRate
     */
    public void setFailureRate(float failureRate) {
        if(failureRate > 0 && failureRate < 1){
            this.failureRate = failureRate;
        }else {
            System.out.println("failureRate needs to be (< 0 && > 1)");
        }

    }

    /**
     * Connects  device1 to another device that is NOT device2
     * DEPRECIATED, Factories are only to be used by Simulation (Martin Janda)
     * @param connectionNumber Id of connection
     * @param device device to which device1 will be connected
     * @author Nikita Druzhkov
     */
    public void connectDevice(int connectionNumber, Device device){
        connectionFactory.createConnection(ConnectionType.ETHERNET, connectionNumber, this.device1, device);
    }
}
