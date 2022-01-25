package net.sim;
public class Main {

    public static void main(String[] args) {
        Simulation testSimulation = new Simulation();
        testSimulation.addDevice(DeviceType.ROUTER, new IPAddress("1.1.1.1"));
        Device d = testSimulation.getDeviceByID(1);
        System.out.println(d.type);

    }
}
