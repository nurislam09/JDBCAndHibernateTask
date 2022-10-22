package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();

    }
}
