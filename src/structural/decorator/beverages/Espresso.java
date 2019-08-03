package structural.decorator.beverages;

/******
 * Parveen D
 * Decorator Pattern
 */
public class Espresso extends Beverages {
    @Override
    String description() {
        return "Espresso ₹5";
    }

    @Override
    int cost() {
        return 5;
    }
}
