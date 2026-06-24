package bg.uni.plovdiv.fitness.decorator;

public class StrengthDecorator extends ProgramDecorator {

    public StrengthDecorator(TrainingProgram program) {
        super(program);
    }

    @Override
    public String getDescription() {
        return program.getDescription() + " + Strength";
    }
}