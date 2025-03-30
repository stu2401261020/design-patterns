package homework_2;

public class Bush  implements HidingPlace {
    @Override
    public void hide(Egg egg) {
        System.out.println("Hide " + egg.getDescription() + " under a bush.");
    }
}
