package abstractFactory;

/**
 * Factory for the Kids line of products.
 */
public class KidsHamburgerFactory implements HamburgerFactory{
    @Override
    public Cheeseburger createCheeseburger() {
        return new KidsCheeseburger();

    }

    @Override
    public Chickenburger createChickenburger() {
        return new KidsChickenburger();
    }
}
