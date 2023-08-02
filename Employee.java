public class Employee {
    private String name;
    private Station station;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    private void assignStation(Station station){
        this.station = station;
    }

    private Station getStation(){
        return this.station;
    }

    private int getId(){
        return this.id;
    }

}
