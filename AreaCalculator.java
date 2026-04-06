import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
                 System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1-3): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of Circle = " + circleArea);
                break;
            }

            case 2 -> {
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of Rectangle = " + rectangleArea);
                break;
            }

            case 3 -> {
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of Triangle = " + triangleArea);
                break;
            }

            default -> {
                System.out.println("Invalid choice!");
            }
            }
        }
    }
}