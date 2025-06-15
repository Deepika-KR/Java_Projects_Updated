package ex_05_Ternaryoperators;

public class MaxOfTwo {
    public static void main(String[] args) {
        int a = 25;
        int b = 42;

        // Using ternary operator
        int max = (a > b) ? a : b;

        System.out.println("Maximum number is: " + max);
    }
}

