package behavioral_design_pattern.Strategy;

public class Division implements Strategy {
    @Override
    public int execute(int num1, int num2) {
        // we should avoid division by
        if(num2 == 0)
            throw new ArithmeticException("Cannot divide by zero");
        return (num1 / num2);
    }
}