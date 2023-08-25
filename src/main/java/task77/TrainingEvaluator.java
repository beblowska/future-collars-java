package task77;

public class TrainingEvaluator {
    public double calculateTrainingEfficiency(double trainingLength, double burnedCalories, double averageHeartRate) {
        double lengthScore = evaluateLength(trainingLength);
        double caloriesScore = evaluateCalories(burnedCalories);
        double heartRateScore = evaluateHeartRate(averageHeartRate);

        return (lengthScore + caloriesScore * 2 + heartRateScore * 3) / 6;
    }

    private int evaluateLength(double trainingLength) {
        if (trainingLength < 30) {
            return 1;
        } else if (trainingLength <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    private int evaluateCalories(double burnedCalories) {
        if (burnedCalories <= 300) {
            return 1;
        } else if (burnedCalories < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    private int evaluateHeartRate(double averageHeartRate) {
        if (averageHeartRate < 160) {
            return 3;
        } else if (averageHeartRate <= 175) {
            return 2;
        } else {
            return 1;
        }
    }
    public String evaluateEfficiencyLevel(double efficiency) {
        if (efficiency < 1.2) {
            return "niska";
        } else if (efficiency < 2) {
            return "dobra";
        } else if (efficiency < 3) {
            return "bardzo dobra";
        } else {
            return "doskonała";
        }
    }
}
