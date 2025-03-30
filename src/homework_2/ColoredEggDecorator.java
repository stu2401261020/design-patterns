package homework_2;

public class ColoredEggDecorator implements Egg {
    private final Egg egg;
    public ColoredEggDecorator(Egg egg) {
        this.egg = egg;
    }

    @Override
    public String getDescription() {
        return "Colored " + this.egg.getDescription();
    }
}
