package Monitor;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.Sensors;

public class CpuMonitor {
    private final CentralProcessor cpu;
    private final Sensors sensors;
    public CpuMonitor(){
        SystemInfo systemInfo = new SystemInfo();
        this.cpu = systemInfo.getHardware().getProcessor();
        this.sensors = systemInfo.getHardware().getSensors();

    }
    public String getCpuName(){
        return cpu.getProcessorIdentifier().getName();
    }
    public double getCpuTemp(){
        return sensors.getCpuTemperature();
    }
    public double getCpuUsage(){
        return cpu.getSystemCpuLoad(1000) * 100;
    }

}
