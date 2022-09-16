
public class App {
    public static void main(String[] args) throws Exception {
        Car blah = new Car("Bugatti", 200);
        Sedan foo = new Sedan("jeff", 113, true);
        System.out.println(blah.getModelName() + " " +  blah.getTopSpeed());
        blah.setTopSpeed(250);
        blah.setModelName("honda");
        System.out.println(blah.getModelName() + " " + blah.getTopSpeed());
        System.out.println(blah.getSound());
        System.out.println(foo.getSound());
    }

}
 