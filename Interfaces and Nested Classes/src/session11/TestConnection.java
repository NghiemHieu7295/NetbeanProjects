package session11;

class Server{
    String port;
    
    public void connectServer(String IP, String port){
        System.out.println("Connecting to server at: " + IP
        + " :" + port);
    }
    
    //inner class
    class IPAddress{
        String getIP(){
            return "101.232.28.12";
        }
    }
}

public class TestConnection {
    public static void main(String[] args){
        if(args.length == 1){
            Server objServer1 = new Server();
            Server.IPAddress objIP = objServer1.new IPAddress();
            objServer1.connectServer(objIP.getIP(), args[0]);
        }
        else{
            System.out.println("Usage: java Server <port-no>");
        }
    }
}
