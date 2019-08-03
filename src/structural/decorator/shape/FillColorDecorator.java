package structural.decorator.shape;

/******
 * Parveen D
 * Decorator Pattern
 */
public class FillColorDecorator extends ShapeDecorator {
    private Color color;

    public FillColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Color: " + color);
    }

    @Override
    public void resize() {
        shape.resize();
    }
}
