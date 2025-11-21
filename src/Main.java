import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n...Calculater Program...\n");

        double num1;
        double num2;
        char operator;
        double result=0;

        System.out.print("Enter First Number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the Operator(+, -, /, *, ^): ");
        operator = sc.next().charAt(0);
        System.out.print("Enter Second Number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;

            case '/' -> {
                if (num2 == 0) {
                    System.out.println("\nCannot divide by zero!");
                }
                else {
                    result = num1 / num2;
                }
            }

            case '^' -> result = Math.pow(num1, num2);
            default  -> System.out.println("\nInvalid Operator!");
        }
        System.out.println("\nAnswer : "+result);

    }
}