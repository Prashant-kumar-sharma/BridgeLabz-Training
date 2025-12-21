// Writing a Java Program to generate 4-digit random numbers and find average, min and max
public class RandomNumberAnalysis {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random number between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    // returns array: [average, min, max]
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    // Main method
    public static void main(String[] args) {

        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\n\nAverage value: " + result[0]);
        System.out.println("Minimum value: " + (int) result[1]);
        System.out.println("Maximum value: " + (int) result[2]);
    }
}
