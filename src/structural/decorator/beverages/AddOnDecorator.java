package structural.decorator.beverages;

/******
 * Parveen D
 * Decorator Pattern
 */
public abstract class AddOnDecorator extends Beverages {
    Beverages beverages;

    public AddOnDecorator(Beverages beverages) {
        this.beverages = beverages;
    }

    abstract String description();

    abstract int cost();
}
