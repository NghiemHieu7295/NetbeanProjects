import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SimpleApp {
    static Connection cnn;
    static String sqlURL = "jdbc:sqlserver://localhost:1433;";
    static String userID, password, dbName;
            
    static{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void logIn(){
        if(cnn != null){
            System.out.println("Bạn đã đăng nhập rồi.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
        
            System.out.print("User ID: ");
            String user = nhap.nextLine();

            System.out.print("Password: ");
            String pass = nhap.nextLine();

            userID = user;
            password = pass;

            try{
                cnn = DriverManager.getConnection(sqlURL, userID, password);

                System.out.println("Đăng nhập thành công!");
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        } 
    }
    
    public void displayListOfDatabases(){
        if(cnn == null){
            System.out.println("Xin hãy đăng nhập trước.");
        }
        else{
            try{
                Statement stat = cnn.createStatement();
                String query = "SELECT name FROM master.sys.databases "
                        + "WHERE database_id > 4";
                ResultSet rs = stat.executeQuery(query);
                
                System.out.println("+--------------------+");
                System.out.println("| DATABASES          |");
                System.out.println("+--------------------+");
                while(rs.next()){
                    System.out.print("| ");
                    System.out.print(rs.getString("name"));
                    int colNameLength = rs.getString("name").length();
                    int n = 19 - colNameLength;
                    for(int i = 1; i <= n; i++){
                        System.out.print(" ");
                    }
                    System.out.println("|");
                }
                System.out.println("+--------------------+");
                stat.close();
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void chooseDatabase(){
        if(cnn == null){
            System.out.println("Xin hãy đăng nhập trước.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
            
            System.out.print("Nhập tên database cần kết nối: ");
            dbName = nhap.nextLine();
            
            sqlURL += "databaseName=" + dbName;
            try{
                cnn = DriverManager.getConnection(sqlURL, userID, password);
                System.out.println("Kết nối tới database thành công!");
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
            sqlURL = sqlURL.substring(0, sqlURL.indexOf(";") + 1);
        }
    }
    
    public void displayListOfTables(){
        if(dbName == null){
            System.out.println("Xin hãy chọn database trước.");
        }
        else{
            try{
                Statement stat = cnn.createStatement();
                String query = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES "
                        + "WHERE TABLE_NAME NOT LIKE 'sys%'";
                
                ResultSet rs = stat.executeQuery(query);
                
                System.out.println("+--------------------+");
                System.out.println("| TABLES             |");
                System.out.println("+--------------------+");
                while(rs.next()){
                    System.out.print("| " + rs.getString("TABLE_NAME"));
                    int tableNameLength = rs.getString("TABLE_NAME").length();
                    int n = 19 - tableNameLength;
                    for(int i = 1; i <= n; i++){
                        System.out.print(" ");
                    }
                    System.out.println("|");
                }
                System.out.println("+--------------------+");
                stat.close();
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void displayTableContent(){
        if(dbName == null){
            System.out.println("Xin hãy chọn database trước.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
            
            System.out.print("Nhập tên bảng cần xem dữ liệu: ");
            String tableName = nhap.nextLine();
            
            try{                                
                Statement stat = cnn.createStatement();
                String query = "SELECT * FROM " + tableName;
                ResultSet rs = stat.executeQuery(query);
                ResultSetMetaData rsmd = rs.getMetaData();
                int colCount = rsmd.getColumnCount();
                
                if(rs.next() == false){
                    System.out.println("Bảng này chưa có dữ liệu.");
                }
                else{
                    while(rs.next()){
                        for(int i = 1; i <= colCount; i++){
                            System.out.print(rs.getString(i) + " ");
                        }
                        System.out.println();
                    }
                }
                stat.close();
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void selectRow(){
        if(dbName == null){
            System.out.println("Xin hãy chọn database trước.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
            
            System.out.print("Mời nhập lệnh SQL: ");
            String sql = nhap.nextLine();
            
            try{
                Statement stat = cnn.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                ResultSetMetaData rsmd = rs.getMetaData();
                int colCount = rsmd.getColumnCount();
                
                while(rs.next()){
                    for(int i = 1; i <= colCount; i++){
                        System.out.print(rs.getString(i) + " ");
                    }
                    System.out.println();
                }
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void insertNewRow(){
        if(dbName == null){
            System.out.println("Xin hãy chọn database trước.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
            
            System.out.print("Mời nhập lệnh SQL: ");
            String sql = nhap.nextLine();

            try{
                Statement stat = cnn.createStatement();
                stat.executeUpdate(sql);

                System.out.println("Thêm bản ghi thành công!");
                stat.close();
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        } 
    }
    
    public void updateRow(){
        if(dbName == null){
            System.out.println("Xin hãy chọn database trước.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
            
            System.out.print("Mời nhập lệnh SQL: ");
            String sql = nhap.nextLine();

            try{
                Statement stat = cnn.createStatement();
                stat.executeUpdate(sql);

                System.out.println("Cập nhật thành công!");
                stat.close();
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void deleteRow(){
        if(dbName == null){
            System.out.println("Xin hãy chọn database trước.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
            
            System.out.print("Mời nhập lệnh SQL: ");
            String sql = nhap.nextLine();
            
            try{
                Statement stat = cnn.createStatement();
                stat.executeUpdate(sql);
                
                System.out.println("Xóa bản ghi thành công!");
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        Scanner nhap = new Scanner(System.in);
        int luachon = 0;
        boolean valid;
        String cont;
        
        while(true){
            System.out.println(">>       Working with SQL Server.       <<");
            System.out.println("+----------------------------------------+");
            System.out.println("| 1. Login.                              |");
            System.out.println("| 2. Display list of databases.          |");
            System.out.println("| 3. Choose database to connect.         |");
            System.out.println("| 4. Display list of tables in database. |");
            System.out.println("| 5. Display content of table.           |");
            System.out.println("| 6. Select data.                        |");
            System.out.println("| 7. Insert data.                        |");
            System.out.println("| 8. Update data.                        |");
            System.out.println("| 9. Delete data.                        |");
            System.out.println("| 10. Exit.                              |");
            System.out.println("+----------------------------------------+");
            System.out.println(">>         Hãy chọn chức  năng.         <<");
            
            do{
                try{
                    luachon = nhap.nextInt();
                    valid = true;
                }
                catch(Exception e){
                    nhap.next();
                    System.out.println("Xin hãy nhập số để chọn chức năng.");
                    valid = false;
                }
            }while(!valid);
            
            switch(luachon){
                case 1:
                    app.logIn();
                    break;
                case 2:
                    app.displayListOfDatabases();
                    break;
                case 3:
                    app.chooseDatabase();
                    break;
                case 4:
                    app.displayListOfTables();
                    break;
                case 5:
                    app.displayTableContent();
                    break;
                case 6:
                    app.selectRow();
                    break;
                case 7:
                    app.insertNewRow();
                    break;
                case 8:
                    app.updateRow();
                    break;
                case 9:
                    app.deleteRow();
                    break;
                case 10:
                    if(cnn != null){
                        try{
                            cnn.close();
                        }
                        catch(SQLException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
                    System.exit(0);
                    break;
                default:
                    break;
            }
            
            nhap.nextLine();
            System.out.print("Bạn có dùng chương trình nữa không? (Y/N) ");
            do{
                cont = nhap.nextLine();
                if(cont.matches("[yYnN]")){
                    break;
                }
                else{
                    System.out.println("Xin hãy nhập lại. Chỉ nhập y hoặc n.");
                }
            }while(true);
            
            if(cont.equalsIgnoreCase("N")){
                break;
            }
        }
        if(cnn != null){
            try{
                cnn.close();
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}