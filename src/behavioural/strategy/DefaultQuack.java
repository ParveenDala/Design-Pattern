package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class DefaultQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Default quack.");
    }
}
