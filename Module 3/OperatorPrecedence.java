public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("Result without parentheses: " + result1);
        System.out.println("Result with parentheses: " + result2);
    }
}
