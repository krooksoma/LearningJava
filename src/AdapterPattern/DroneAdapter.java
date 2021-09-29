package AdapterPattern;

public class DroneAdapter implements Duck{
    Drone drone;

    public DroneAdapter(Drone drone){
        this.drone = drone;
    }

    @Override
    public void fly() {
        drone.startRotors();
        drone.takeOff();
    }

    @Override
    public void quack() {
        drone.buzz();
    }
}
