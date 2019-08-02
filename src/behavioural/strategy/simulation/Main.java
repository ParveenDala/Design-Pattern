package behavioural.strategy.simulation;

/******
 * Parveen D
 * Strategy Pattern
 */
public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(new ConsoleWriter());
        simulation.run();
    }
}
