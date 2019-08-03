package structural.decorator.shape;

/******
 * Parveen D
 * Decorator Pattern
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Circle");
    }

    @Override
    public void resize() {
        System.out.println("Rectangle Circle");
    }
}
