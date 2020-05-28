/*
 Codigo basado de:
 Sarcar, V. (2019). Java Design Patterns: A Hands-On Experience with Real-World Examples (2.a ed.).
 Recuperado de https://www.apress.com/gp/book/9781484240779
 */

//Main class

package abstractFactory;

/**
 * Main class used to demonstrate the pattern.
 */
public class Client {
    public static void main(String[] args) {
        HamburgerFactory tecHamburgerFactory;
        Cheeseburger tecCheeseburger;
        Chickenburger tecChickenburger;
        System.out.println("Abstract Factory Pattern Demo\n");
        // Creating a KidsCheeseburger through the KidsHamburgerFactory
        tecHamburgerFactory = new KidsHamburgerFactory();
        tecCheeseburger = tecHamburgerFactory.createCheeseburger();
        tecCheeseburger.order();
        tecCheeseburger.beverage();
        tecCheeseburger.price();
        System.out.println("----------------------");
        // Creating a KidsChickenburger through the KidsHamburgerFactory
        tecChickenburger = tecHamburgerFactory.createChickenburger();
        tecChickenburger.order();
        tecChickenburger.beverage();
        tecChickenburger.price();
        System.out.println("----------------------");
        // Creating an AdultCheeseburger through the AdultHamburgerFactory
        tecHamburgerFactory = new AdultHamburgerFactory();
        tecCheeseburger = tecHamburgerFactory.createCheeseburger();
        tecCheeseburger.order();
        tecCheeseburger.beverage();
        tecCheeseburger.price();
        System.out.println("----------------------");
        // Creating an AdultChickenburger through the AdultHamburgerFactory
        tecChickenburger = tecHamburgerFactory.createChickenburger();
        tecChickenburger.order();
        tecChickenburger.beverage();
        tecChickenburger.price();
    }
}
