public class HW_3 {
    public static void main(String[] args) {
        double[] numbers = {
                2.5, 4.8,
                -1.2, 3.3, -7.6,
                5.0, -2.1, 0.0,
                -3.9, 1.1, -4.4,
                6.6, -8.8, 2.2,
                -5.5
        };

        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double number : numbers) {
            if (!foundNegative && number < 0) { // ищем только отрицательное
                foundNegative = true; // нашли первое отрицательное
            } else if (foundNegative && number > 0) { // после него берём положительные
                sum += number;
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Среднее арифметическое: " + average);
    }
}
