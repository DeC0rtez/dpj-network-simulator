package net.sim;

import java.util.LinkedList;

public class EventScheduler {
    public LinkedList<Event> eventQueue;

    public void schedule(Event e){
        eventQueue.add(e);
    }
    public Event next(){
        Event currentEvent = eventQueue.removeFirst();
        currentEvent.eventHandler.handleEvent(currentEvent);
        return currentEvent;
    }
}
//Nikita Druzhkov