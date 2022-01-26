package net.sim;

import java.util.LinkedList;

/**
 * Class that handles the scheduling of events
 *
 * @author Nikita Druzhkov
 */
public class EventScheduler {
    public LinkedList<Event> eventQueue = new LinkedList<Event>();

    /**
     * Add an  event to the queue
     * Only to be used by Simulation
     * Use Simulation.scheduleEvent()
     * @param e
     */
    public void schedule(Event e){
        eventQueue.add(e);
    }

    /**
     * Return the next event and remove it from the queue
     * Only to be used by Simulation
     * @return
     */
    public Event next(){
        Event currentEvent = eventQueue.removeFirst();
        currentEvent.eventHandler.handleEvent(currentEvent);
        return currentEvent;
    }
}
//Nikita Druzhkov