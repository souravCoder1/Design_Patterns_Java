package behavioral_design_pattern;

import behavioral_design_pattern.Strategy.Division;
import behavioral_design_pattern.Strategy.OperationManager;

public class App {
    public static void main(String[] args) {
        OperationManager manager = new OperationManager();
        manager.setStrategy(new Division());
        int result = manager.execute(10, 5);
        System.out.println(result);
    }
}
