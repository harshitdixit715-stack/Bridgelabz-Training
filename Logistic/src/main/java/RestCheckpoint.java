
public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint (String id, String name , double dis, int act,int exp) {
        super(id, name, dis, act, exp);
    }
    @Override
    public boolean isCritical(){
        return false;
    }

    @Override
    public String getType() {
        return "Rest";
    }

    @Override
    public double Penalty() {
        int delay = actualDuraction-expectedDuraction;
        if(delay>30){
            return delay*0.5;
        }
        return 0;
    }
}
