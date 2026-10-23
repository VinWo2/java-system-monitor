package Monitor;

import oshi.SystemInfo;
import oshi.hardware.NetworkIF;

import java.util.List;
public class NetworkInfo {
    private final List<NetworkIF> networkIFS;

    public NetworkInfo(){
        SystemInfo systemInfo = new SystemInfo();
        this.networkIFS = systemInfo.getHardware().getNetworkIFs();
    }
    public void NetInfo(){
        for (int i = 0; i< networkIFS.size();i++){
            NetworkIF net = networkIFS.get(i);
            System.out.println("Name:         " + net.getDisplayName());
            System.out.println("Interface:    " + net.getName());
            System.out.println("IPv4:         " + String.join(", ", net.getIPv4addr()));
            System.out.println("MAC-Adresse:  " + net.getMacaddr());
            System.out.println("Geschwindigkeit: " + net.getSpeed() / 1000000 + " Mbit/s");
        }
    }

}
