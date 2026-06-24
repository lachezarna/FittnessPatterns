package bg.uni.plovdiv.fitness.decorator;

public class CardioDecorator extends ProgramDecorator {

    public CardioDecorator(TrainingProgram program) {
        super(program);
    }

    @Override
    public String getDescription() {
        return program.getDescription() + " + Cardio";
    }
}