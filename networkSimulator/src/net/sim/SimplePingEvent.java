package net.sim;

public class SimplePingEvent extends Event {
    public String pingSourceIP;
    public int id;
    public String pingDestinationIP;
    public String pingMessage;
    public EventType type;

    public SimplePingEvent(EventHandler _handler, int id) {
        super(_handler);
        this.id = id;
        type = EventType.SIMPLEPING;
    }
}
// Daniel De Corte
