import java.util.ArrayList;

public class Kitchen {
    int stationId = 0;
    int stationCount = 0;
    private ArrayList<Station> stations;

    public Kitchen() {
        stations = new ArrayList<>();
    }

    protected void addStation(String stationName) {
        stations.add(new Station(stationName, stationId));
        stationId += 1;
        stationCount += 1;

    }
}
