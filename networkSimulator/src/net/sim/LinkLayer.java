package net.sim;

public class LinkLayer extends Layer{
    //Martin Janda
    public PhysicalLayer physicalLayer;

    public LinkLayer(){
        physicalLayer = new PhysicalLayer();
    }

    public PhysicalLayer getPhysicalLayer() {
        return physicalLayer;
    }
}

