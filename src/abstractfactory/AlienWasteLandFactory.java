package abstractfactory;

public class AlienWasteLandFactory implements WorldFactory {
    @Override
    public Terrain createTerrain() {
        return new WastelandTerrain();
    }

    @Override
    public Enemy createEnemy() {
        return new AlienSwarm();
    }
}
