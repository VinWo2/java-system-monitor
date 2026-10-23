package Monitor;

import oshi.SystemInfo;
import oshi.hardware.HWDiskStore;

import java.util.List;

public class DiskMonitor {
    private final List<HWDiskStore> disk;

    public DiskMonitor(){
        SystemInfo systemInfo = new SystemInfo();
        this.disk = systemInfo.getHardware().getDiskStores();
    }
    public void DiskInfo(){
        for (int i = 0; i< disk.size();i++){
            HWDiskStore d = disk.get(i);
            System.out.println("Storage :"+d.getSize() /1000000000 + "GB");
            System.out.println("SSD/HDD Model :"+d.getModel());
        }
    }
}
