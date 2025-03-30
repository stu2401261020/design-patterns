package homework_2;

public class StickerEggDecorator  implements Egg {
    private final Egg egg;
    public StickerEggDecorator(Egg egg) {
        this.egg = egg;
    }

    @Override
    public String getDescription() {
        return "Sticker " + this.egg.getDescription();
    }
}
