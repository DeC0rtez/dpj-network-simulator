package net.sim;

/**
 * This class contains the link layer the 2nd level of ISO OSI
 * It encapsulates the physical layer
 *
 * @author Martin Janda
 */
public class LinkLayer extends Layer{
    //Martin Janda
    public PhysicalLayer physicalLayer;

    public LinkLayer(){
        physicalLayer = new PhysicalLayer();
    }

    /**
     * Returns encapsulated physical layer
     * @return
     */
    public PhysicalLayer getPhysicalLayer() {
        return physicalLayer;
    }
}

