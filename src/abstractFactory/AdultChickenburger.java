package abstractFactory;

/**
 * Chickenburger type product for the Adult line of products.
 */
public class AdultChickenburger implements Chickenburger {
    @Override
    public void order() {
        System.out.println("This burger's size is large, with double chicken patty.");
        System.out.println("It comes with chicken nuggets and BBQ sauce.");
    }

    @Override
    public void price() {
        System.out.println("It costs ₡4000 and you get a free DatosParty bottle.");
    }

    @Override
    public void beverage() {
        System.out.println("The beverage is a large-sized SpriTEC.");
    }
}
