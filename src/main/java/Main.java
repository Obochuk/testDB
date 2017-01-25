import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {



    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "SELECT * FROM user";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("user"));
                user.setPassword(resultSet.getString("password"));

                System.out.println(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
