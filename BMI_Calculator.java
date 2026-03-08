import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        double weightInKg = weight * 0.45359237;
        double heightInMeters = inches * 0.0254;

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("BMI is: " + bmi);
        sc.close();
        }
    }
}

