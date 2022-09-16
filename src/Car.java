public class Car {
    protected String modelName;
    protected int topSpeed;
    public Car(String modelName, int topSpeed){
        this.modelName = modelName;
        this.topSpeed = topSpeed;
    }
    public void setModelName(String modelName_){
        modelName = modelName_;
    }
    public void setTopSpeed(int topSpeed_){
        topSpeed = topSpeed_;
    }
    public String getModelName(){
        return modelName;
    }
    public int getTopSpeed(){
        return topSpeed;
    }
    public String getSound(){
        return "vroom";        
    }
}
