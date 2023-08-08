package Database;

import Model.Employee;

public class EmployeeInteraction implements Interaction {

    public void add(Employee employee) {
        String insertSQL = "INSERT INTO Employees (name, position, contact) VALUES (?, ?, ?)";
    }

    public void delete(Employee employee) {
        String deleteSQL = "DELETE FROM Employees WHERE name = ?";
    }

    public void get(int employeeId) {
        String selectSQL = "SELECT id, name, position, contact FROM Employees WHERE name = ?";
    }
}