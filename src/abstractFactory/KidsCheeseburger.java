package abstractFactory;

/**
 * Cheeseburger type product for the Kids line of products.
 */
public class KidsCheeseburger implements Cheeseburger {
    @Override
    public void order() {
        System.out.println("This burger's size is small and has a single meat patty.");
        System.out.println("It comes with fries.");
    }

    @Override
    public void price() {
        System.out.println("It costs ₡2500 and you get a free TECmon toy.");
    }

    @Override
    public void beverage() {
        System.out.println("The beverage is a small-sized ChocolaTEC.");
    }
}
