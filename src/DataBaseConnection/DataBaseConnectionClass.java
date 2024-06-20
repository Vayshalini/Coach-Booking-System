package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseConnectionClass {

    public static Connection createDBConnection() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/europianbus", "root", "");

            return con;
        } catch (ClassNotFoundException ex) {
            return null;
        }
    }
}
