package ex_05_Ternaryoperators;

public class EvenOddCheck {
    public static void main(String[] args) {
        int number = 7;

        // Using ternary operator to check even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);
    }
}