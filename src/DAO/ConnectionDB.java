package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Цей клас відповідає за встановлення з'єднання з  базою даних car. Використовуємо `java.sql.DriverManager` для встановлення з'єднання.
public class ConnectionDB {
    public static Connection getConnection() throws SQLException {
        final String URL = "jdbc:mysql://localhost:3306/car?serverTimeZone=Europe/Kiev ";
        final String USER_NAME = "root";
        final String PASSWORD = "3214";
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);

    }
}













