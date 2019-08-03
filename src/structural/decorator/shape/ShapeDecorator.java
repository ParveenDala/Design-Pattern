package structural.decorator.shape;

/******
 * Parveen D
 * Decorator Pattern
 */
public abstract class ShapeDecorator implements Shape {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
