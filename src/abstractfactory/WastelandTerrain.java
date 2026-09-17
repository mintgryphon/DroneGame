package abstractfactory;

public class WastelandTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("[Terrain] Barren radioactive soil, toxic geysers, and purple fog.");
    }
}
