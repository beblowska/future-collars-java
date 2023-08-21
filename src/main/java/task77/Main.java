package task77;


public class Main {
    public static void main(String[] args) {

        double length = 30;
        double calories = 300;
        double heartRate = 160;

        System.out.println("Training length: " + length);
        System.out.println("Calories: " + calories);
        System.out.println("Heart rate: " + heartRate);

        TrainingEvaluator evaluator = new TrainingEvaluator();
        double efficiency = evaluator.calculateTrainingEfficiency(length, calories, heartRate);
        String efficiencyLevel = evaluator.evaluateEfficiencyLevel(efficiency);

        System.out.println("Efficiency: " + efficiency);
        System.out.println("Efficiency level: " + efficiencyLevel);
    }
}
