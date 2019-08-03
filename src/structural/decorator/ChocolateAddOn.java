package structural.decorator;

/******
 * Parveen D
 * Decorator Pattern
 */
public class ChocolateAddOn extends AddOnDecorator {
    Beverages beverages;

    public ChocolateAddOn(Beverages beverages) {
        this.beverages = beverages;
    }

    @Override
    void description() {
        System.out.println("Chocolate ₹2");
    }

    @Override
    int cost() {
        return beverages.cost() + 2;
    }
}
