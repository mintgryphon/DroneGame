package abstractfactory;

public interface WorldFactory {
    Terrain createTerrain();
    Enemy createEnemy();
}
