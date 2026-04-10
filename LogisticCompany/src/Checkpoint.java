public class Checkpoint {
    String checkpointId;;
    String locationName;

    public int getDistanceFromLast() {
        return distanceFromLast;
    }

    public void setDistanceFromLast(int distanceFromLast) {
        this.distanceFromLast = distanceFromLast;
    }

    int distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(int expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    @
    public String toString(){
        return locationName + " " + checkpointId + " " + expectedDuration + " " + actualDuration + " " ;
    }
}
