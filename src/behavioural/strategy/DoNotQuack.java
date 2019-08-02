package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class DoNotQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Don't quack.");
    }
}
