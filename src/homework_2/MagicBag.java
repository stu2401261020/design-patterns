package homework_2;

import java.util.Random;

public class MagicBag {
    // Egg Factory
    public Egg createEgg(EggType type) {
        Egg eggInstance = switch (type) {
            case CHICKEN -> new ChickenEgg();
            case OSTRICH -> new OstrichEgg();
            case DINOSAUR -> new DinosaurEgg();
        };

        if (new Random().nextBoolean()) {
            eggInstance = new ColoredEggDecorator(eggInstance);
        } else {
            eggInstance = new StickerEggDecorator(eggInstance);
        }

        return eggInstance;
    }
}
