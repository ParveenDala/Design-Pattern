package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class DoNotFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Don't fly.");
    }
}
