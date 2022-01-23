package net.sim;


public abstract class Connection implements  EventHandler{
    //Vlad
    private int connectionIDIncrement = 0;
    private int id = connectionIDIncrement++;
    private Device device1;
    private Device device2;
    private float failureRate;
    private int speed;

    public void setFailureRate(float failureRate) {
        this.failureRate = failureRate;
    }
}
