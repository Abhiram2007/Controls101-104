public class Sedan extends Car{
    public Sedan(String modelName, int topSpeed){
        super(modelName, topSpeed);
    }
    @Override
    public String getSound(){
        return "vroom but sedan";
    }
}
