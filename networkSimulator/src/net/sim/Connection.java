package net.sim;


public abstract class Connection implements  EventHandler{
    //Vlad & Nikita
    public int id;
    public Device device1;
    public Device device2;
    public ConnectionType type;
    public float failureRate;
    public int speed;
    public Connection(Device _device1, Device _device2, int id, ConnectionType _type){
        device1 = _device1;
        device2 = _device2;
        this.id = id;
        type = _type;
    }
    public void setFailureRate(float failureRate) {
        if(failureRate > 0 && failureRate < 1){
            this.failureRate = failureRate;
        }else {
            System.out.println("failureRate needs to be (< 0 && > 1)");
        }

    }
}
