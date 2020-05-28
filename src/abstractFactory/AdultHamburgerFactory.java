package abstractFactory;

/**
 * Factory for the Adult line of products.
 */
public class AdultHamburgerFactory implements HamburgerFactory{
    @Override
    public Chickenburger createChickenburger() {
        return new AdultChickenburger();
    }

    @Override
    public Cheeseburger createCheeseburger() {
        return new AdultCheeseburger();
    }
}
