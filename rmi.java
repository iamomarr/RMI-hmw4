
//amrshekha 11923707
//omarabuali 11923947

public interface serverrmi {
    public double calculat(int days,int equation1,int equation2 );
    }
    
    public class server1 implements serverrmi { //def first server with first equation
    public double calculat(int days, int equation1 ) {
        equation1 = days  * 10;
        System.out.println(equation1);
    }
    }
    
    public class server2 implements serverrmi { //def second server with second equation
    public double calculat(int days,int equation2) {
        equation2 = days  * 10 - days  * 0.05;
        System.out.println(equation2);
    }
    }
    
    public class clientclass {
    public static void main(String[] args) {
    int days  = Integer.parseInt(args[0]);
    
    serverrmi server = null;
    
    try{ //here we put the if stetment as u ask in the graph of hmw
    if (days  <= 10) {
    server =  ("//localhost/server1");
    } else {
    server =  Naming.lookup("//localhost/server2");
    }
    
    System.out.println("cost: " + server.calculat(days));
    }
    }
    }
