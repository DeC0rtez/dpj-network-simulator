package net.sim;
public class Main {

    public static void main(String[] args) {
        Simulation testSimulation = new Simulation();
        testSimulation.addDevice(DeviceType.ROUTER, new IPAddress("1.1.1.1"));
        testSimulation.addDevice(DeviceType.COMPUTER, new IPAddress("1.1.1.2"));
        Device d = testSimulation.getDeviceByID(0);
        Device d1 = testSimulation.getDeviceByID(1);
        System.out.println(d.type);
        testSimulation.addConnection(d, d1, ConnectionType.ETHERNET);
        testSimulation.printTopology();

    }
}
