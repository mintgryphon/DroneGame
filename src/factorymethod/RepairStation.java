package factorymethod;

public class RepairStation extends DroneStation{
    @Override
    public Drone createDrone() {
        return new RepairDrone();
    }
}
