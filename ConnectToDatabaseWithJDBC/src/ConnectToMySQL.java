
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToMySQL {

    public static void main(String[] args) {
        Connection cnn = null;
        String sqlUrl = "jdbc:mysql://localhost:3306/quanlysinhvien?useSSL=false";
        String userID = "root";
        String pass = "hello11321";
        
        try{
            cnn = DriverManager.getConnection(sqlUrl, userID, pass);
            System.out.println("Connect Successfully!");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }   
}