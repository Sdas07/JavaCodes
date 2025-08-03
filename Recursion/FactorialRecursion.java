public class FactorialRecursion {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;  // base case
        }
        return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int num = 4;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
