package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Setup {

    public static final String url = "jdbc:sqlite:employee.db";
    public static void setup() {
        String insertSQL = "INSERT INTO Employees (name, position, contact) VALUES (?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {
            String createTableSQL = "CREATE TABLE Employees (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, position TEXT,contact TEXT, station TEXT)";
            statement.executeUpdate(createTableSQL);

            System.out.println("LOG: Table created successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
