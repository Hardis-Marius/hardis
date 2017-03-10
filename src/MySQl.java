import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQl {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    "");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `studentas`");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("S_id"));
                System.out.print("|");
                System.out.print(resultSet.getString("name"));
                System.out.print("|");
                System.out.print(resultSet.getString("surname"));
                System.out.println("|");
            }
            statement.execute("UPDATE `studentas` SET `Name` = 'Tadass', `phone` = '984268' WHERE `studentas`.`S_id` = 1 ");

            connection.close();
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
