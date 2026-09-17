package abstractfactory;

public class CyborgEnemy implements Enemy {
    @Override
    public void spawn() {
        System.out.println("[Enemy] Rogue combat cyborg with energy blades appears!");
    }
}
