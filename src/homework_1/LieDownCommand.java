package homework_1;

public class LieDownCommand implements Command {
    Trainee trainee;

    public LieDownCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        this.trainee.layDown();
    }
}
