// Writing a Java Program to find Shortest, Tallest and Mean Height of Football Players
public class FootballTeamHeight {

    // Method to generate random heights between 150 and 250
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            min = Math.min(min, h);
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            max = Math.max(max, h);
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Heights of Football Players:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n\nShortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
