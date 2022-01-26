package net.sim;

/**
 * Class dedicated to representing a SimplePingEvent
 * Create one of these using the constructor and pass it to Simulation.scheduleEvent() to schedule a ping
 *
 * @author Daniel De Corte
 */
public class SimplePingEvent extends Event {
    public String pingSourceIP;
    public int id;
    public String pingDestinationIP;
    public String pingMessage;
    public EventType type;

    /**
     * Constructor of SimplePingEvent
     * Tells a device of a certain ID to ping the first device it has been connected to
     * @param _handler Device you wish this event to be handled by
     * @param id the ID of the Device you wish to send the simple ping from
     */
    public SimplePingEvent(EventHandler _handler, int id) {
        super(_handler);
        this.id = id;
        type = EventType.SIMPLEPING;
    }
}
// Daniel De Corte
