package homework_2;

public class Main {
    public static void main(String[] args) {
        Egg egg1 = EasterBunny.getInstance().createEgg(EggType.CHICKEN);
        Egg egg2 = EasterBunny.getInstance().createEgg(EggType.OSTRICH);
        Egg egg3 = EasterBunny.getInstance().createEgg(EggType.DINOSAUR);

        EasterBunny.getInstance().hideEgg(egg1, new Basket());
        EasterBunny.getInstance().hideEgg(egg2, new Bush());
        EasterBunny.getInstance().hideEgg(egg3, new Forest());
    }
}
