package abstractFactory;

/**
 * AbstractFactory. Interface for the factories, and their lines of products.
 */
public interface HamburgerFactory {
    Chickenburger createChickenburger();
    Cheeseburger createCheeseburger();
}
