
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToMSSQLServer {

    public static void main(String[] args) {
        Connection cnn = null;
        
        String sqlUrl = "jdbc:sqlserver://localhost:1433;";
        String userID = "Hieu";
        String pass = "hello";
        
        try{
            cnn = DriverManager.getConnection(sqlUrl, userID, pass);
            System.out.println("Connection Successfully!");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }   
    }  
}