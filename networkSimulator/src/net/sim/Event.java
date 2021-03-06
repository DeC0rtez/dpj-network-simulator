package net.sim;

/**
 * Abstract representation of an event
 *
 * @author Nikita Druzhkov
 */
public abstract  class Event {
    public EventHandler eventHandler;
    public EventType type;
    public Event(EventHandler _handler){
        eventHandler = _handler;
    }
}
//Nikita Druzhkov