package bg.uni.plovdiv.fitness;

import bg.uni.plovdiv.fitness.decorator.*;
import bg.uni.plovdiv.fitness.observer.Trainee;
import bg.uni.plovdiv.fitness.singleton.FitnessGym;
import bg.uni.plovdiv.fitness.strategy.*;

public class Main {

    public static void main(String[] args) {

        FitnessGym gym = FitnessGym.getInstance();

        Trainee ivan = new Trainee("Ivan");
        Trainee maria = new Trainee("Maria");

        gym.addObserver(ivan);
        gym.addObserver(maria);

        gym.setCurrentMode("Summer Fitness Program");

        ivan.setStrategy(new CardioStrategy());
        maria.setStrategy(new StrengthStrategy());

        ivan.performTraining();
        maria.performTraining();

        TrainingProgram program = new BasicProgram();

        program = new CardioDecorator(program);
        program = new StrengthDecorator(program);

        System.out.println();
        System.out.println("Personalized program:");
        System.out.println(program.getDescription());
    }
}