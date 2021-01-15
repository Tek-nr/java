
package atm_project;

import java.util.Scanner;

public class LogIn {
    public boolean login(Account account){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your user name: ");
        String nickname= scanner.nextLine();
        System.out.print("Please enter your password: ");
        String password= scanner.nextLine();
        if ((nickname.equals(account.getNickname()))&&(password.equals(account.getPassword()))){
        System.out.println("Process successful!");
        return true;
        }
        else {
        System.out.println("Operation failed!");
        return false;
        }        

        
    }
}
