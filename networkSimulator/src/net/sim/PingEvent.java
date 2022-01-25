package net.sim;

public class PingEvent extends Event {
    public String pingSourceIP;
    public String pingDestinationIP;
    public String pingMessage;

    public PingEvent(EventHandler _handler) {
        super(_handler);
    }
}
// Daniel De Corte