import java.util.Scanner;

public class Login {
    String[] username = new String[100];
    String[] pass = new String[100];
    String[] contactname = new String[100];
    String[] connumber = new String[100];

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
    public String  contactsv(String user1 , String contact , String connum){
        for (int i = 1; i < 100; i++) {
            if (username[i] != null) {
                username[i] = user1;
                for (int j = 1; j < 100; j++){
                    contactname[j] = contact;
                    connumber[j] = connum;
                    break;




                }

                }
            }







    }

    public String getConnumber(String user1){
    
          for (int i = 0; i < 100; i++){

        
            if ( username[i] = user1 ) {
                for (int j = 1; j < 100; j++) {
                    System.out.println(contactname[j] + connumber[j]);
                }




                    
    }     } }   
}

