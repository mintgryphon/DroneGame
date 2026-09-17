package factorymethod;

public class ScoutDrone implements Drone{
    @Override
    public void performMission() {
        System.out.println("[Scout Drone] Scanning perimeter, mapping hostiles and radar signals.");
    }
}
