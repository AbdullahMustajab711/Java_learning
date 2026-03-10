import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter your Percentage to find grade: ");
            double percent = sc.nextDouble();

            if(percent >= 90){
                System.out.println("You scored A+ grade.");
            }else if(percent >= 80){
                System.out.println("You scored A grade.");
            }else if(percent >= 70){
                System.out.println("You scored B grade.");
            }else if(percent >= 60){
                System.out.println("You scored C grade.");
            }else if(percent >= 50){
                System.out.println("You scored D grade.");
            }else{
                System.out.println("You Got F. Keep Trying!!");
            }

        sc.close();

        }
    }
}
