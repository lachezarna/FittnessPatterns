package bg.uni.plovdiv.fitness.observer;

import bg.uni.plovdiv.fitness.strategy.TrainingStrategy;

public class Trainee implements Observer {

    private String name;
    private TrainingStrategy strategy;

    public Trainee(String name) {
        this.name = name;
    }

    public void setStrategy(TrainingStrategy strategy) {
        this.strategy = strategy;
    }

    public void performTraining() {
        System.out.print(name + ": ");
        strategy.train();
    }

    @Override
    public void update(String trainingMode) {
        System.out.println(name +
                " received new training mode: "
                + trainingMode);
    }
}