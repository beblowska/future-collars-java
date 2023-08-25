package task77;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainingEvaluatorTest {
    @ParameterizedTest
    @CsvSource({
            "20, 250, 150, 1.5, dobra",
            "45, 350, 170, 2.5, bardzo dobra",
            "70, 420, 180, 2.83, bardzo dobra",
            "80, 280, 160, 2.33, bardzo dobra",
            "25, 280, 165, 1.92, dobra",
            "40, 450, 150, 2.42, bardzo dobra",
            "90, 380, 170, 2.75, bardzo dobra",
            "10, 200, 180, 1.42, niska"})
    public void testTrainingEfficiency(double length, double calories, double heartRate, double expectedEfficiency, String expectedLevel) {
        TrainingEvaluator evaluator = new TrainingEvaluator();
        double calculatedEfficiency = evaluator.calculateTrainingEfficiency(length, calories, heartRate);
        String evaluatedLevel = evaluator.evaluateEfficiencyLevel(calculatedEfficiency);

        assertEquals(expectedEfficiency, calculatedEfficiency, 0.01);
        assertEquals(expectedLevel, evaluatedLevel);
    }
}
