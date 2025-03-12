package homework_1;

public class Main {
    public static void main(String[] args) {
        Trainee trainee = new Trainee("Trainee");

        Observer observerTrainee1 = new ObserverTrainee("Observer 1");
        Observer observerTrainee2 = new ObserverTrainee("Observer 2");
        Observer observerTrainee3 = new ObserverTrainee("Observer 3");

        Instructor instructor = new Instructor(trainee);
        instructor.giveLieDownCommand();
        instructor.giveStandUpCommand();

        trainee.registerObserver(observerTrainee1);
        trainee.registerObserver(observerTrainee2);

        instructor.giveLieDownCommand();
        instructor.giveStandUpCommand();

        trainee.registerObserver(observerTrainee3);

        instructor.giveLieDownCommand();
        instructor.giveStandUpCommand();

        trainee.removeObserver(observerTrainee1);

        instructor.giveLieDownCommand();
        instructor.giveStandUpCommand();
    }
}