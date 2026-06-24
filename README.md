This project models a fitness gym where an instructor can change the training mode and notify all trainees about the change. Each trainee can choose an appropriate training strategy and customize their training program according to their personal needs.

## Design Patterns Used
#### Singleton Pattern
The FitnessGym class implements the Singleton pattern and ensures that only one gym instance exists in the system.

#### Observer Pattern
The FitnessGym class notifies all registered Trainee objects whenever the training mode changes.

#### Strategy Pattern
Each trainee can choose a different training strategy through the TrainingStrategy interface. The project provides the following strategies:

* CardioStrategy
* StrengthStrategy

This allows training behavior to be changed dynamically at runtime.

#### Decorator Pattern
The basic training program can be extended with additional exercises without modifying existing code. The project includes:

* CardioDecorator
* StrengthDecorator

These decorators allow the creation of personalized training programs such as:

* Basic Training Program
* Basic Training Program + Cardio
* Basic Training Program + Cardio + Strength

