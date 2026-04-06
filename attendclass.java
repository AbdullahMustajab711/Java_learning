import java.util.Scanner;

public class attendclass {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter class number eligiblity: ");
        double attend = sc.nextInt();
        double Class = 20;

        double percent = attend / Class * 100;

        if(percent >= 75){
            System.out.println("Your Attendance is 75%");
        }else{
            System.out.println("Not Eligible.");
        }
        }
        
    }
}
