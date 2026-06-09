import java.util.LinkedList;
class DriverDetail {
    String name;
    String driverId;
    //LinkedList<Integer> checkout = new LinkedList<>();
    RouteLinkedList<Checkpoint> routeHistory;

    public DriverDetail(String name, String driverId){
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }
    public double getRouteScale(){
        double distance = routeHistory.computeTotalDistance();
        double Penalty = routeHistory.computeTotalPenalty();
        return  distance-Penalty;
    }
}
