public class Recursive {
    // Recursive method to calculate factorial of a number
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}