import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        // we find even or odd using conditional statement.

        System.out.print("Enter number to find even or odd: ");
        double num = sc.nextDouble();

        if(num % 2 == 0){
            System.out.println( num + " is Even ");
        }else{
            System.out.println( num + " is odd ");
        }

        sc.close();

        }
    }
}
