package net.sim;

public class NetworkLayer extends Layer{
    //Martin Janda
    public LinkLayer linkLayer;

    public NetworkLayer(){
        this.linkLayer = new LinkLayer();
    }

    public LinkLayer getLinkLayer() {
        return linkLayer;
    }

    public PhysicalLayer getPhysicalLayer(){
        return getLinkLayer().getPhysicalLayer();
    }
}
