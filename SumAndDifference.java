import java.util.Scanner;

public class SumAndDifference {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);

        sc.close();
        }
    }
}

