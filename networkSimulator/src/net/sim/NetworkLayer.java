package net.sim;

/**
 * This class is used to contain the network layer the third level of ISO OSI
 * It encapsulates the link layer and physical layer
 *
 * @author Martin Janda
 */
public class NetworkLayer extends Layer{
    //Martin Janda
    public LinkLayer linkLayer;

    public NetworkLayer(){
        this.linkLayer = new LinkLayer();
    }

    /**
     * Returns the encapsulated link layer
     * @return
     */
    public LinkLayer getLinkLayer() {
        return linkLayer;
    }

    /**
     * Returns the encapsulated physical layer
     * @return
     */
    public PhysicalLayer getPhysicalLayer(){
        return getLinkLayer().getPhysicalLayer();
    }
}
