package net.sim;

import java.util.LinkedList;

public abstract class Device implements EventHandler {
    public int id = 0;
    public NetworkLayer layerStack;
    public DeviceType type;
    public IPAddress ipAddress;
    public LinkedList<Connection> connections;

    public Device(NetworkLayer _layer, DeviceType _type, int _deviceID, IPAddress _ip) {
        id = _deviceID;
        layerStack = _layer;
        type = _type;
        ipAddress = _ip;
    }

    public  void addConnection(Connection connection){
        connections.add(connection);
    }

    /**
     * Method for handling a PingEvent
     * @param event must be a PingEvent
     */
    public void handleSimplePing(PingEvent event){
        Device device1 = connections.getFirst().device1;
        Device device2 = connections.getFirst().device2;

        if(device1 == this){
            device2.acknowledgePing(event.pingSourceIP, event.pingDestinationIP, event.pingMessage, device1);
        } else{
            device1.acknowledgePing(event.pingSourceIP, event.pingDestinationIP, event.pingMessage, device2);
        }
    }

    /**
     * Prints out a simplePing recieved
     * @param pingSourceIP
     * @param pingDestinationIP
     * @param pingMessage
     */
    private void acknowledgePing(String pingSourceIP, String pingDestinationIP, String pingMessage,Device device2) {
        System.out.print("Device: ");
        System.out.print(this.id);
        System.out.println();
        System.out.print(pingDestinationIP);
        System.out.print(": ");
        System.out.print("RECIEVED PING FROM: ");
        System.out.print(pingSourceIP);
        System.out.print("Device: ");
        System.out.println(device2.id);
        System.out.println("Message: ");
        System.out.println(pingMessage);

    }

}
// Nikita Druzhkov
