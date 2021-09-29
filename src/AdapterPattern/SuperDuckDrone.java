package AdapterPattern;

public class SuperDuckDrone implements Drone{

    @Override
    public void buzz() {
        System.out.println("Super duck drone Beep beep");
    }

    @Override
    public void takeOff() {
        System.out.println("Super Duck drone Takes off");
    }

    @Override
    public void startRotors() {
        System.out.println("Super Duck Drone start its engines");
    }
}
