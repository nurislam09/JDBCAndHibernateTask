package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String url = "jdbc:postgresql://localhost:5432/HomeWork";
    public static final String user = "postgres";
    public static final String password = "1234";

    public Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to the PostgreSQL server successfully!");
            return connection;
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

}
