package bg.uni.plovdiv.fitness.decorator;

public abstract class ProgramDecorator implements TrainingProgram {

    protected TrainingProgram program;

    public ProgramDecorator(TrainingProgram program) {
        this.program = program;
    }
}