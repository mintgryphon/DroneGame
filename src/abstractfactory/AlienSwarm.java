package abstractfactory;

public class AlienSwarm implements Enemy {
    @Override
    public void spawn() {
        System.out.println("[Enemy] Acidic alien swarm crawling out of the hives!");
    }
}
