package abstractFactory;

/**
 * Cheeseburger type product for the Adult line of products.
 */
public class AdultCheeseburger implements Cheeseburger{
    @Override
    public void order() {
        System.out.println("This burger's size is large, with double meat patty. ");
        System.out.println("It comes with onion rings.");
    }

    @Override
    public void price() {
        System.out.println("It costs ₡4000 and you get a free TECmon coffee mug.");
    }

    @Override
    public void beverage() {
        System.out.println("The beverage is a large-sized Iced TE(a)C.");
    }
}
