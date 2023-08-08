package Model;

public class Employee {
    private String name;
    private Station station;
    private int id;

    private String position;

    private String email;

    public Employee(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }
}

