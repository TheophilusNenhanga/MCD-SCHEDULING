import Model.Employee;
import Model.Kitchen;

import java.util.ArrayList;

public class Store {
    private int idValue = 0;

    private int employeeCount;

    private String storeName;
    ArrayList<Employee> employees;

    Kitchen kitchen;

    public Store(String storeName) {
        this.storeName = storeName;
        employeeCount = 0;
        kitchen = new Kitchen();
        employees = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public void addEmployee(String employeeName) {

    }

    public void viewEmployees() {

    }

    public void updateEmployee(int employeeId) {

    }

    public void removeEmployee(int employeeId) {

    }


    protected int getEmployeeCount() {
        return this.employeeCount;
    }

    protected void showStoreMenu() {
        // TODO: Add store menu
    }

}
