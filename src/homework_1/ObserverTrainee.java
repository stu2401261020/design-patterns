package homework_1;

public class ObserverTrainee implements Observer {
    String name;

    public ObserverTrainee(String name) {
        this.name = name;
    }

    @Override
    public void update(Boolean isUpright) {
        if (isUpright) {
            this.standUp();
        } else {
            this.layDown();
        }
    }

    private void layDown() {
        System.out.println( "Observer " + this.name + " lay down.");
    }

    private void standUp() {
        System.out.println( "Observer " + this.name + " stood up.");
    }
}
