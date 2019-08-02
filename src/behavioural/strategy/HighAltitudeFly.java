package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class HighAltitudeFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("High altitude fly.");
    }
}
