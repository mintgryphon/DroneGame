package factorymethod;

public class ScoutStation extends DroneStation {
    @Override
    public Drone createDrone() {
        return new ScoutDrone();
    }
}
