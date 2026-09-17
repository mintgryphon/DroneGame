package factorymethod;

public class AttackStation extends DroneStation{
    @Override
    public Drone createDrone(){
        return new AttackDrone();
    }
}
