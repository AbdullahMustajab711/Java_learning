import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your obtain numbers: ");
            int obtain = sc.nextInt();
            System.out.print("Enter your total numbers: ");
            int total = sc.nextInt();

            double grade = (double) obtain / total * 100;
            int range = (int) grade / 10;

            switch (range) {
                case 10 -> {}
                case 9 -> {
                    System.out.println("you score A+ grade.");
                    break;
                }
                case 8 -> {
                    System.out.println("you score A grade.");
                    break;
                }
                case 7 -> {
                    System.out.println("you score B grade.");
                    break;
                }
                case 6 -> {
                    System.out.println("you score C grade.");
                    break;
                }
                case 5 -> {
                    System.out.println("you score D grade.");
                    break;
                }
                default -> {
                    System.out.println("You are fail.");
                }
            }
        }
    }
}