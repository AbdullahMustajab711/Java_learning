import java.util.*;

public class Meter_converter {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your number in inches: ");
            double inches = sc.nextDouble();

            double meter = inches * 0.0254;

            System.out.println(inches + " Inches is equals to: " + meter + " meter");

        }
    }
}

