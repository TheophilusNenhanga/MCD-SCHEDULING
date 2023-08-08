package Database;

import Model.Employee;

public interface Interaction {
    public void add(Employee employee);
    public void delete(Employee employee);
    public void get(int employeeId);
}
