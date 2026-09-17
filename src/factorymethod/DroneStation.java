package factorymethod;

public abstract class DroneStation {
    public abstract Drone createDrone();
    public void deployDrone() {
        System.out.println("Starting drone deployment protocol...");
        Drone drone = createDrone();
        drone.performMission();
        System.out.println("Deployment finished.\n");
    }
}
