import java.util.Scanner;

public class Days_converter {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in);){

        System.out.print("Enter numbers of days: ");
        int days = sc.nextInt();

        int months = days / 30;
        int remaining_days = days % 30;

        System.out.print("Days are: " + days + "\nMonths are: " + months + "Remaining days: " + remaining_days);

        sc.close();
        
       }
    }
}
