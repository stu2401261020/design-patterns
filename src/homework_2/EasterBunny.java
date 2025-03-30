package homework_2;

public class EasterBunny {
    private static final EasterBunny INSTANCE = new EasterBunny();
    private static final MagicBag BAG = new MagicBag();
    private EasterBunny() {}

    public static EasterBunny getInstance() {
        return INSTANCE;
    }

    public Egg createEgg(EggType type) {
        return BAG.createEgg(type);
    }

    public void hideEgg(Egg egg, HidingPlace place) {
        place.hide(egg);
    }

}
