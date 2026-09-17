import factorymethod.DroneStation;
import factorymethod.ScoutStation;
import factorymethod.AttackStation;
import factorymethod.RepairStation;

import abstractfactory.WorldFactory;
import abstractfactory.CyberCityFactory;
import abstractfactory.AlienWasteLandFactory;
import abstractfactory.WorldClient;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   PART A: FACTORY METHOD DEMO");
        System.out.println("========================================");

        DroneStation scoutStation = new ScoutStation();
        scoutStation.deployDrone();
        DroneStation attackStation = new AttackStation();
        attackStation.deployDrone();
        DroneStation repairStation = new RepairStation();
        repairStation.deployDrone();

        System.out.println("[Configuration] Selecting Cyber City Biome:");
        WorldFactory biomeFactory = new CyberCityFactory();
        WorldClient client = new WorldClient(biomeFactory);
        client.initializeWorld();

        System.out.println("[Configuration] Switching to Alien Wasteland Biome:");
        biomeFactory = new AlienWasteLandFactory();
        client = new WorldClient(biomeFactory);
        client.initializeWorld();
    }
}