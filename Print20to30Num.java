
import java.util.Scanner;

public class Print20to30Num {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your number to print: ");
            double n = sc.nextDouble();

            System.out.println("The Numbers is Printed.");

            for(int i = 1; i <= n; i++){
                System.out.println(i);
            }
        }

    }
}
