package Monitor;


public class Main {
    public static void main(String[] args) {
        CpuMonitor cpuMonitor = new CpuMonitor();
        MemoryMonitor memoryMonitor = new MemoryMonitor();
        System.out.println("-----------------CPU-----------------");
        System.out.println("CPU Name: "+cpuMonitor.getCpuName());
        System.out.println("CPU Temp: "+cpuMonitor.getCpuTemp()+"°C");
        System.out.println("CPU Usage: "+(int)cpuMonitor.getCpuUsage()+ "%");
        System.out.println("---------------Memory-----------------");
        System.out.printf("Available Memory: %.2f\n",memoryMonitor.getAvailableMemory());
        System.out.printf("Used Memory: %.2f\n",memoryMonitor.getUsedMemory());
        System.out.printf("Total Memory: %.2f\n",memoryMonitor.getTotalMemory());
        System.out.println("----------------Disk-------------------");
    }
}
