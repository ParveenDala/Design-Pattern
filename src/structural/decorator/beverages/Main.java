package structural.decorator.beverages;

/******
 * Parveen D
 * Decorator Pattern
 */
public class Main {
    public static void main(String[] args) {
        Beverages espresso = new Espresso();
        ChocolateAddOn chocolateAddOn = new ChocolateAddOn(espresso);
        System.out.println(chocolateAddOn.description());
        System.out.println("Total cost ₹" + chocolateAddOn.cost());
    }
}
