package net.sim;


public abstract class Connection implements  EventHandler{
    //Vlad & Nikita
    private static int connectionIDIncrement = 0;
    public int id = connectionIDIncrement++;
    public Device device1;
    public Device device2;
    public ConnectionType type;
    public float failureRate;
    public int speed;
    public Connection(Device _device1, Device _device2, ConnectionType _type){
        device1 = _device1;
        device2 = _device2;
        id = connectionIDIncrement;
        type = _type;
        connectionIDIncrement++;
    }
    public void setFailureRate(float failureRate) {
        this.failureRate = failureRate;
    }
}
