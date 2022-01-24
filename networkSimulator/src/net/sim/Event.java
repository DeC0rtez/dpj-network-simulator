package net.sim;

public abstract  class Event {
    public EventHandler eventHandler;
    public Event(EventHandler _handler){
        eventHandler = _handler;
    }
}
//Nikita Druzhkov