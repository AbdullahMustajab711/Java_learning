import java.util.Scanner;

class Choice1{
    double num1, num2, sum;

    public double calculateSum(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your num1: ");
            num1 = sc.nextDouble();
            System.out.print("Enter your num2: ");
            num2 = sc.nextDouble();
            sum = num1 + num2;
            return sum;
        }
    }
}

class Choice {
    double base, exponent;

    public double calculatePower() {
        try( Scanner sc = new Scanner(System.in);){
        System.out.print("Enter the value of base: ");
        base = sc.nextDouble();
        System.out.print("Enter the value of Exponent: ");
        exponent = sc.nextDouble();
        return Math.pow(base, exponent);
       }
    }
}

public class SwitchProgram {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in);){

            System.out.println("Case 1: Enter 1 for CalculatePower.");
            System.out.println("Case 2: Enter 2 for CalculateSum.");
            System.out.println("Case 3: Enter 3 for Exit.");

            System.out.print("Enter your Choice: ");
            int chi = scn.nextInt();

        switch (chi) {
            case 1 -> {
                Choice cho = new Choice();
                System.out.println("The expo is: " + cho.calculatePower());
                break;
            }
            case 2 -> {
                Choice1 cho1 = new Choice1();
                System.out.println("The sum of two numbers is: " + cho1.calculateSum());
                break;
            }
            case 3 -> {
                System.out.println("You are exit from the program.");
                break;
            }
            default -> {
                 System.out.println("Invalid choice");
            }
            }
        }
    }
}