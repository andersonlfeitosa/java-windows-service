# Java App as Windows Service

I used [NSSM](https://nssm.cc) for help me on this task. NSSM is a service helper which doesn't suck.

### Steps:
1. Download NSSM
1. Put NSSM (32 or 64 bit) on the Windows Path;
1. Download and install Java Runtime Environment (32 or 64 bit);
1. Put java.exe on the Windows Path;
1. Install your service using Windows Prompt Command: 
```nssm install my-java-service "java" "-jar" "C:\java-windows-service.jar"```
1. You can remove service:
```nssm remove my-java-service```
1. You can check the status of service:
```nssm status my-java-service```
1. You can start service:
```nssm start my-java-service```
1. You can stop service:
```nssm stop my-java-service```

### Reference
https://stackoverflow.com/questions/1617458/how-to-create-windows-service-from-java-jar
