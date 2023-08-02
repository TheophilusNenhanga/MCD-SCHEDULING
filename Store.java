import java.util.ArrayList;

public class Store {
    private int idValue = 0;

    private int employeeCount;

    private String storeName;
    ArrayList<Employee> employees;

    Kitchen kitchen;

    public Store(String storeName){
        this.storeName = storeName;
        employeeCount = 0;
        kitchen = new Kitchen();
        employees = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    protected void addEmployee(String employeeName){
        employees.add(new Employee(employeeName, idValue));
        this.idValue += 1;
        employeeCount += 1;
    }


    protected int getEmployeeCount(){
        return this.employeeCount;
    }

    protected void showStoreMenu(){
        // TODO: Add store menu
    }

}
