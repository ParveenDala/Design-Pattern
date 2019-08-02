package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class DefaultDisplay implements DisplayBehavior {

    @Override
    public void display() {
        System.out.println("Default display.");
    }
}
