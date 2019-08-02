package behavioural.strategy;

/******
 * Parveen D
 * Strategy Pattern
 */
public class Main {
    public static void main(String[] args) {
        Duck cityDuck = new Duck(new DefaultQuack(), new DefaultDisplay(), new DefaultFly());
        cityDuck.display();
        cityDuck.quack();
        cityDuck.fly();

        System.out.println();
        Duck rubberDuck = new Duck(new DoNotQuack(), new RubberDisplay(), new DoNotFly());
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
    }
}
