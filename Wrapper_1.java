import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class NumberConverter {
    public Integer stringToInteger(String str) {
        return Integer.valueOf(str);
    }

    public String doubleToString(Double d) {
        return String.valueOf(d);
    }
}

class StatisticsCalculator {
    public Integer findMinimum(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public Integer findMaximum(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public Double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (Double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    public Double calculateStandardDeviation(List<Double> numbers) {
        double mean = calculateAverage(numbers);
        double sumSquaredDiff = 0;
        for (Double num : numbers) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiff / numbers.size());
    }
}
