package abstractFactory;

/**
 * Chickenburger type product for the Kids line of products.
 */
public class KidsChickenburger implements Chickenburger{
    @Override
    public void order() {
        System.out.println("This burger's size is large, with single chicken patty.");
        System.out.println("It also comes with mashed potato");
    }

    @Override
    public void price() {
        System.out.println("It costs ₡2500 and you get a free DatosParty plush.");
    }

    @Override
    public void beverage() {
        System.out.println("The beverage is a small-sized TECola.");
    }
}
