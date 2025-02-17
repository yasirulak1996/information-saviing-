
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        username = scaner.line();
        passwordd=scanner.line()


        login_usr()
        if(isfound){

        contact.getcontact();
        contact.displaycontact();






    }
}






 public class Users{

    String[] user_name = new user_name[100];
    String[] password =new password[100];
    String[] email = new email[100];
     int[]  bday = new bday[100];
     Scanner scanner = new Scanner(System.in);
     String[] name = new name[100]
     String[] phone_no = new phone_no[100]



     public void getContacts() {
         for (int i = 0; i < 3; i++) { // Outer loop for users
             System.out.print("\nEnter username for User " + (i + 1) + ": ");
             user_name[i] = scanner.nextLine();  // Store username
             password[i] = scanner.nextLine();



             for (int j = 0; j < 2; j++) { // Inner loop for contacts
                 System.out.print("Enter contact name " + (j + 1) + ": ");
                 name[j] = scanner.nextLine();

                 System.out.print("Enter phone number " + (j + 1) + ": ");
                 phone_no[j] = scanner.nextLine();
             }
         }
     }

     public void displayUserContacts(String username) {
             boolean found = false;

             for (int i = 0; i < 3; i++) {
                 if (user_name[i].equalsIgnoreCase(username)) {  // Check for matching username
                     found = true;
                     System.out.println("\nContacts for " + username + ":");
                     for (int j = 0; j < 2; j++) {
                         System.out.println("  Name: " + name[j] + ", Phone: " + phone_no[j]);
                     }
                     break; // Stop after finding the user
                 }
             }

             if (!found) {
                 System.out.println("Username not found.");
             }
         }




     }

 }
 public class login{

    public static login_usr(string user_name[i],string username,string password[i],string passwordd){
        for (int i = 0; i <100; i++) {
            if (user_name[i].equalsIgnoreCase(username)&&password[i].equalsignorecase(passwordd)) {  // Check for matching username
                found = true;

                else return"incorrect loggings"


    }
 }