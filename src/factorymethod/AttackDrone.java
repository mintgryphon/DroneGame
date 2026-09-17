package factorymethod;

public class AttackDrone implements Drone{
    @Override
    public void performMission() {
        System.out.println("[Attack Drone] Locking on target, deploying plasma missiles!");
    }

}
