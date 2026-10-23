package Monitor;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;

public class MemoryMonitor {
    private final GlobalMemory memory;

    public MemoryMonitor(){
        SystemInfo systemInfo = new SystemInfo();
        memory = systemInfo.getHardware().getMemory();
    }

    public double getAvailableMemory(){
    return (double) memory.getAvailable() /(1024*1024*1024); // GB
    }
    public double getUsedMemory(){
        return (double) memory.getTotal() /(1024*1024*1024) - (double) memory.getAvailable() /(1024*1024*1024);
    }

    public double getTotalMemory(){
    return (double) memory.getTotal() /(1024*1024*1024);// GB
    }
}
