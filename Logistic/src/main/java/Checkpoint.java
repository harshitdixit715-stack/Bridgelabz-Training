abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuraction;
    int actualDuraction;

    public Checkpoint(String id , String name, double distance, int expected, int actual){
        this.checkpointId = id;
        this.locationName = name;
        this.distanceFromLast = distance;
        this.expectedDuraction = expected;
        this.actualDuraction = actual;

    }
    public boolean isDelayed(){
        return actualDuraction>expectedDuraction;
    }
    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double Penalty();
}
