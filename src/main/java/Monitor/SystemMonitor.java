package Monitor;
public class SystemMonitor {
    public void output(){
        CpuMonitor cpuMonitor = new CpuMonitor();
        MemoryMonitor memoryMonitor = new MemoryMonitor();
        NetworkInfo networkInfo = new NetworkInfo();
        DiskMonitor disk =new DiskMonitor();
        System.out.println("----------------CPU-----------------");
        System.out.println("CPU Name: "+cpuMonitor.getCpuName());
        System.out.println("CPU Temp: "+cpuMonitor.getCpuTemp()+"°C");
        System.out.println("CPU Usage: "+(int)cpuMonitor.getCpuUsage()+ "%");
        System.out.println("---------------Memory-----------------");
        System.out.printf("Available Memory: %.2f\n",memoryMonitor.getAvailableMemory());
        System.out.printf("Used Memory: %.2f\n",memoryMonitor.getUsedMemory());
        System.out.printf("Total Memory: %.2f\n",memoryMonitor.getTotalMemory());
        System.out.println("--------------Disk-Info----------------");
        disk.DiskInfo();
        System.out.println("-------------Network-Info-------------");
        networkInfo.NetInfo();

    }

}
