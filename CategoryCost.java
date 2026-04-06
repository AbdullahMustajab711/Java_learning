import java.util.Scanner;

public class CategoryCost {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            double electronics = 0;
        double groceries = 0;
        double clothing = 0;

        System.out.print("Enter category (1=Electronics, 2=Groceries, 3=Clothing): ");
        int choice = sc.nextInt();

        System.out.print("Enter amount spent: ");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1 -> {
                electronics += amount;
                System.out.println("Total Electronics Cost: " + electronics);
                break;
            }
            case 2 -> { 
                groceries += amount;
                System.out.println("Total Groceries Cost: " + groceries);
                break;
            }
            case 3 -> {
                clothing += amount;
                System.out.println("Total Clothing Cost: " + clothing);
                break;
            }  
            default -> {
                System.out.println("Invalid choice");
            }
            }
        }
    }
}