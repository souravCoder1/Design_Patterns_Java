package behavioral_design_pattern.Strategy;

public class OperationManager {
    // we have to use composition
    // BECAUSE THE BEHAVIOR CAN BE CHANGED AT RUN-TIME
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return this.strategy.execute(num1, num2);
    }

/*
    public void execute(Object o, int num1, int num2) {
            // test this branch of the app
        if (o instanceof Addition)
            ((Addition) o).execute(num1, num2);
            // this branch as well
        else if (o instanceof Multiplication)
            ((Multiplication) o).execute(num1, num2);
    }
 */
}
