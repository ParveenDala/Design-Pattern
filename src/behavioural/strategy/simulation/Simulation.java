package behavioural.strategy.simulation;

import java.util.Random;

/******
 * Parveen D
 * Strategy Pattern
 */
public class Simulation {
    private Writer writer;
    private Random random;

    public Simulation(Writer writer) {
        this.writer = writer;
        random = new Random();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            writer.write(random.nextFloat() > 0.5 ? "Heads" : "Tails");
        }
    }

}
