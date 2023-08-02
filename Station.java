public class Station {
    private String name;
    private final int minimumSkill = 4;
    private Employee employee;
    private int stationId;

    public Station(String name, int stationId){
        this.stationId = stationId;
        this.name = name;
    }

    private void assignEmployee(Employee employee){
        this.employee = employee;
    }
}
