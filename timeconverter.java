import java.util.Scanner;

public class timeconverter{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Second: ");
            int second = sc.nextInt();
            int minutes = second/60;
            int remainingsecond = second % 60;
            System.out.println("Second is: " + second + "\nMinutes is: " + minutes + "\nRemaining Second: " + remainingsecond);            
        }
    }
}