package structural.decorator.shape;

/******
 * Parveen D
 * Decorator Pattern
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resize Circle");
    }
}
