package Monitor;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;

public class MemoryMonitor {
    private final GlobalMemory memory;

    public MemoryMonitor(){
        SystemInfo systemInfo = new SystemInfo();
        this.memory = systemInfo.getHardware().getMemory();
    }

    public double getAvailableMemory(){
    return (double) memory.getAvailable() /(1024.0*1024.0*1024.0); // GB
    }
    public double getUsedMemory(){
        return (double) memory.getTotal() /(1024.0*1024.0*1024.0) - (double) memory.getAvailable() /(1024.0*1024.0*1024.0);
    }

    public double getTotalMemory(){
    return (double) memory.getTotal() /(1024*1024*1024);// GB
    }
}
