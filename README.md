# java-system-monitor
A simple system monitoring dashboard built with Java to see important System-Information (CPU,RAM,Network,Disk).
<img width="1195" height="738" alt="image" src="https://github.com/user-attachments/assets/387f0137-dab1-4922-a9cc-ab03bb4dd24f" />

## Technology
- Java 21
- OSHI (systeminformation)
- Maven

# Installation,Start
1. git clone [https://github.com/VinWo2/java-system-monitor.git](https://github.com/VinWo2/java-system-monitor.git)
2. cd java-system-monitor
3. mvn compile exec:java -Dexec.mainClass="Monitor.Main"

# Tips
- CPU Temp often not provided under Windows -> output 0

# License
MIT, see License [LICENSE](LICENSE)
