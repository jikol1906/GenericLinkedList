/**
 * Created by borisgrunwald on 10/10/2016.
 */
import java.sql.*;

public class MySqlConnectionSingleton {

    private static Statement statement;
    private Connection connection;
    private static MySqlConnectionSingleton mySqlConnectionSingleton;

    private MySqlConnectionSingleton() {
        //TODO: Nedenstående variabler skal du tilpasse dit setup!
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "classicmodels";
        String driver = "com.mysql.jdbc.Driver";
        String user= "root";
        String pass = "bori0066";

        try {
            Class.forName(driver).newInstance();
            this.connection = (Connection) DriverManager.getConnection(url + dbName, user, pass);
        } catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        if (mySqlConnectionSingleton == null) {
            mySqlConnectionSingleton = new MySqlConnectionSingleton();
        }


        String query = "SELECT * FROM employees";
        statement = mySqlConnectionSingleton.connection.createStatement();
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String ID = resultSet.getString("employeeNumber");
                System.out.println("Username: " + ID);

                String FirstName = resultSet.getString("firstName");
                System.out.println("Password: " + FirstName);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
