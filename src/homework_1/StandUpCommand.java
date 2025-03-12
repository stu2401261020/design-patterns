package homework_1;

public class StandUpCommand implements Command {
    Trainee trainee;
    public StandUpCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        this.trainee.standUp();
    }
}
