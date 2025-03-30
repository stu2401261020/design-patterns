package homework_2;

public class Forest implements HidingPlace {
    @Override
    public void hide(Egg egg) {
        System.out.println("Hide " + egg.getDescription() + " in the forest.");
    }
}
