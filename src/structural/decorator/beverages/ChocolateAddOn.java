package structural.decorator.beverages;

/******
 * Parveen D
 * Decorator Pattern
 */
public class ChocolateAddOn extends AddOnDecorator {

    public ChocolateAddOn(Beverages beverages) {
        super(beverages);
    }

    @Override
    String description() {
        return beverages.description() + " with Chocolate ₹2";
    }

    @Override
    int cost() {
        return beverages.cost() + 2;
    }
}
