package Monitor;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.Sensors;

public class CpuMonitor extends SystemMonitor{
    public final CentralProcessor cpu;
    public CpuMonitor(){
        SystemInfo systemInfo = new SystemInfo();
        this.cpu = systemInfo.getHardware().getProcessor();

    }
    public String getCpuName(){
        return cpu.getProcessorIdentifier().getName();
    }
    public double getCpuTemp(){
        SystemInfo systemInfo = new SystemInfo();
        return systemInfo.getHardware().getSensors().getCpuTemperature();
    }
    public double getCpuUsage(){
        return cpu.getSystemCpuLoad(1000)*100;

    }

}
