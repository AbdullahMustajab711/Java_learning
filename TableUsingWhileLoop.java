import java.util.Scanner;

public class TableUsingWhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your number to print table: ");
            int n = sc.nextInt();

            int i = 1;

            while (i <= 10) {
                int table = n * i;
                System.out.println(n + " x " + i + " = " + table);
                i++;
            }
        }
    }
}