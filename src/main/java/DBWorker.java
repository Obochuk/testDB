import java.sql.*;

public class DBWorker {

    private static String URL = "jdbc:mysql://localhost:3306/user?useUnicode=true&useSSL=true";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBWorker(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
