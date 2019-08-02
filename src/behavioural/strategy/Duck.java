package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class Duck {
    private QuackBehavior quackBehavior;
    private DisplayBehavior displayBehavior;
    private FlyBehavior flyBehavior;

    public Duck(QuackBehavior quackBehavior, DisplayBehavior displayBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void display() {
        displayBehavior.display();
    }

    public void fly() {
        flyBehavior.fly();
    }

}
