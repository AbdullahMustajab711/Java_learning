import java.util.Scanner;

public class Bio_Data{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Father name: ");
        String father_name = sc.nextLine();

        System.out.print("Enter your age: ");
        String age = sc.nextLine();

        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter your department: ");
        String department = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.println("\nDetail of Your BioData");

        System.out.println("\nName is: " + name);
        System.out.println("Father name is: " + father_name);
        System.out.println("Age is: " + age);
        System.out.println("Gender is: " + gender);
        System.out.println("derpartment is: " + department);
        System.out.println("Email is: " + email);
        
        sc.close();
        }
    }
}

