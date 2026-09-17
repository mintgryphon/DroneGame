package abstractfactory;

public class CyberCityFactory implements WorldFactory {
    @Override
    public Terrain createTerrain() {
        return new CyberTerrain();
    }

    @Override
    public Enemy createEnemy() {
        return new CyborgEnemy();
    }
}
