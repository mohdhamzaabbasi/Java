
import java.util.Arrays;
import java.util.List;
import java.util.List;
class StatisticsCalculator {

    public static Double findMinimum(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        Double min = Double.MAX_VALUE;
        for (Double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static Double findMaximum(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        Double max = Double.MIN_VALUE;
        for (Double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static Double calculateAverage(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        Double sum = 0.0;
        for (Double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    public static Double calculateStandardDeviation(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        Double average = calculateAverage(numbers);
        Double sumOfSquaredDifferences = 0.0;
        for (Double num : numbers) {
            sumOfSquaredDifferences += Math.pow(num - average, 2);
        }
        return Math.sqrt(sumOfSquaredDifferences / numbers.size());
    }
}
public class Main {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(2.5, 3.8, 9.2, 5.6, 7.3);
        
        System.out.println("Minimum: " + StatisticsCalculator.findMinimum(numbers));
        System.out.println("Maximum: " + StatisticsCalculator.findMaximum(numbers));
        System.out.println("Average: " + StatisticsCalculator.calculateAverage(numbers));
        System.out.println("Standard Deviation: " + StatisticsCalculator.calculateStandardDeviation(numbers));
    }
}
