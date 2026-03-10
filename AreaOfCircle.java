import java.util.*;

public class AreaOfCircle{
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        
        System.out.print("Enter your Radius: ");
        double radius = sc.nextDouble();

        final double PI = 3.14;

        double Area = PI*radius*radius;

        System.out.println("The Given Radius is: " + radius);
        System.out.println("The Area of Circle is: " + Area);
        
        sc.close();

       }
    }
}