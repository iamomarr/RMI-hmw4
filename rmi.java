public interface serverrmi {
public double calculat(int ndays);
}

public class RMIserver1 implements serverrmi {
public double calculat(int ndays) {
return ndays * 10;
}
}

public class RMIserver2 implements serverrmi {
public double calculat(int ndays) {
return ndays * 10 - ndays * 0.05;
}
}

public class AdvertisementRMIClient {
public static void main(String[] args) {
int ndays = Integer.parseInt(args[0]);

serverrmi server = null;

try {
if (ndays <= 10) {
server = (serverrmi) Naming.lookup("rmi://localhost/server1");
} else {
server = (serverrmi) Naming.lookup("rmi://localhost/server2");
}

System.out.println("cost: " + server.calculat(ndays));
} catch (Exception e) {
e.printStackTrace();
}
}
}
