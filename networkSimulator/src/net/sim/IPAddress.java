package net.sim;

/**
 * Class for representing IP adresses
 *
 * @author Nikita Druzhkov
 */
public class IPAddress {
    public String ipStr = "";
    public IPAddress(String ip){
        ipStr = ip;
    }

    /**
     * Returns bytes of the ip address
     * @return
     */
    public byte[] GetBytes(){
        byte[] bytes = {0,0,0,0};
        if (ipStr.length() > 0){
            String[] ipStrings = ipStr.split("\\.");
            if (ipStrings.length == 4){
                for (int i = 0; i < ipStrings.length; i++){
                    byte byt = (byte) Integer.parseInt(ipStrings[i]);
                    bytes[i] = byt;
                }
            }
        }
        return bytes;
    }
}
// Nikita Druzhkov
