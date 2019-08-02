package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class RubberDisplay implements DisplayBehavior {

    @Override
    public void display() {
        System.out.println("Rubber display.");
    }
}
