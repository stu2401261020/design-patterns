package homework_1;

public class Instructor {
    Trainee trainee;
    Command lieDownCommand;
    Command standUpCommand;

    public Instructor(Trainee trainee){
        this.trainee = trainee;
        this.lieDownCommand = new LieDownCommand(trainee);
        this.standUpCommand = new StandUpCommand(trainee);
    }

    public void giveLieDownCommand() {
        this.lieDownCommand.execute();
    }

    public void giveStandUpCommand() {
        this.standUpCommand.execute();
    }
}
