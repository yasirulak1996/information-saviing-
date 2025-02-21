
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login loginSystem = new Login();

        while (true) {
            System.out.print("Do you have an account? (yes/no/exit): ");
            String account = scanner.nextLine();

            if (account.equalsIgnoreCase("yes")) {
                System.out.print("Enter username: ");
                String user1 = scanner.nextLine();
                System.out.print("Enter password: ");
                String pass1 = scanner.nextLine();

                boolean isLoggedIn = loginSystem.login(user1, pass1);
                if (isLoggedIn) {
                   while (true){
                    System.out.println("do you want enter new contact or see contacts ");
                    String a = scanner.nextLine().toLowerCase();
                    if (a.equals("yes")){
                        System.out.println("enter contact name");
                    String contact = scanner.nextLine();
                        System.out.println("enter contact number");
                    String connum = scanner.nextLine();
                    loginSystem.contactsv(user1,connum,contact);}
                    else {
                        loginSystem.getConnumber(user1);
                  }

                    }
                } else {
                    System.out.println("Incorrect login credentials.");
                }

            } else if (account.equalsIgnoreCase("no")) {
                System.out.print("Enter new username: ");
                String name = scanner.nextLine();
                System.out.print("Enter new password: ");
                String password = scanner.nextLine();

                loginSystem.sign_up(name, password);

                System.out.println("Account created successfully!");
            } else if (account.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break; // Exit the loop
            } else {
                System.out.println("Invalid input. Please enter 'yes', 'no', or 'exit'.");
            }
        }

        scanner.close();
    }
}
