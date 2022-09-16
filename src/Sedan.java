public class Sedan extends Car implements Driveable{
    private int numWheels;
    private boolean gotInACarAccident;
    public Sedan(String modelName, int topSpeed, boolean gotInACarAccident){
        super(modelName, topSpeed);
        this.gotInACarAccident = gotInACarAccident;
        numWheels = 4;
    }
    @Override
    public String getSound(){
        return "vroom but sedan";
    }
    public int numWheels(){
        if(gotInACarAccident){
            return numWheels - 4;
        }
        else return numWheels;
    }
}

