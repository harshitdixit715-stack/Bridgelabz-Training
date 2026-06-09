public class Delivery extends Checkpoint {
    public Delivery (String id, String name , double dis, int act,int exp) {
        super(id, name, dis, act, exp);
    }
    @Override
    public boolean isCritical(){
        return true;
    }

    @Override
    public double Penalty() {
        if(!isDelayed()) return 0;
        return (actualDuraction-expectedDuraction);
    }
    @Override
    public String getType(){
        return "Delivery";
    }
}
