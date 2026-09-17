package factorymethod;

public class RepairDrone implements Drone{
    @Override
    public void performMission() {
        System.out.println("[Repair Drone] Deploying nanobots to restore allied defense shields.");
    }
}
