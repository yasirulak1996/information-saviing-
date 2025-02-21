import java.util.Scanner;

public class Login {
    String[] username = new String[100];
    String[] pass = new String[100];
    String[] contactname = new String[100];
    String[] connumber = new String[100];
    String[] user = new String[100];

    public void sign_up(String name, String password) {
        if (name.isEmpty() || password.isEmpty()) {
            System.out.println("please enter username and password");
        } else {
            for (int i = 1; i < 100; i++) {
                if (username[i] == null) {
                    username[i] = name;
                    pass[i] = password;
                    System.out.println("User registered successfully!");
                    break;

                }


            }
        }
    }

    public boolean login(String user1, String pass1) {
        for (int i = 0; i < 100; i++) {
            if (username[i] != null && username[i].equals(user1) && pass[i].equals(pass1)) {
                return true;
            }
        }
        return false;
    }
    public void contactsv(String user1, String contact, String connum) {
        for (int i = 0; i < 100; i++) {
            if (username[i] != null && username[i].equals(user1)) { // Find the user
                for (int j = 0; j < 100; j++) { // Find an empty slot
                    if (contactname[j] == null) {
                        user[j] = user1;
                        contactname[j] = contact;
                        connumber[j] = connum;
                        System.out.println("Contact saved successfully!");
                        return;
                    }
                }
            }
        }
        System.out.println("User not found or contact list is full.");
    }

    public void getConnumber(String user1) {
        boolean found = false;
        System.out.println("Contacts for " + user1 + ":");
        for (int j = 0; j < 100; j++) {
            if (user[j] != null && user[j].equals(user1)) {
                found = true;
                System.out.println(contactname[j] + " - " + connumber[j]);
            }
        }
        if (!found) {
            System.out.println("No contacts found for this user.");
        }
    }
}

