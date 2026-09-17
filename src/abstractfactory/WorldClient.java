package abstractfactory;

public class WorldClient {
    private final Terrain terrain;
    private final Enemy enemy;

    public WorldClient(WorldFactory factory) {
        this.terrain = factory.createTerrain();
        this.enemy = factory.createEnemy();
    }

    public void initializeWorld() {
        System.out.println("Initializing mission area...");
        terrain.render();
        enemy.spawn();
        System.out.println("World is ready.\n");
    }
}
