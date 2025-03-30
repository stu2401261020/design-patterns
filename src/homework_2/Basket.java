package homework_2;

public class Basket implements HidingPlace {
    @Override
    public void hide(Egg egg) {
        System.out.println("Hide " + egg.getDescription() + " in a basket.");
    }
}
