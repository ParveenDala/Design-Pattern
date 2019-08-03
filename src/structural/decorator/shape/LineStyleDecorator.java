package structural.decorator.shape;

/******
 * Parveen D
 * Decorator Pattern
 */
public class LineStyleDecorator extends ShapeDecorator {
    private LineStyle lineStyle;

    public LineStyleDecorator(Shape shape, LineStyle lineStyle) {
        super(shape);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("LineStyle: " + lineStyle);
    }

    @Override
    public void resize() {
        shape.resize();
    }
}
