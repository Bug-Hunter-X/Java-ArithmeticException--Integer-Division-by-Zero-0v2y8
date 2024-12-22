public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; 
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero detected.");
            // Handle the exception appropriately (e.g., log the error, use a default value)
        }
    }
}