package structural.decorator.shape;

/******
 * Parveen D
 * Decorator Pattern
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();

        System.out.println();
        //Circle with RED Color
        FillColorDecorator fillColorDecorator = new FillColorDecorator(shape, Color.RED);
        fillColorDecorator.draw();

        System.out.println();
        //Circle,  color is RED and line style is DOT
        LineStyleDecorator lineStyleDecorator = new LineStyleDecorator(fillColorDecorator, LineStyle.DOT);
        lineStyleDecorator.draw();

    }
}
