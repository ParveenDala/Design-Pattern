package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class DefaultFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Default fly.");
    }
}
