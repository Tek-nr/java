
package atm_project;

import java.util.Scanner;

public class ATM {
    
    public void processing(Account account){
        LogIn login=new LogIn();
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME!");
        System.out.println("****************************************************");
        int chanceToEnter=3;
        
        while(true){
            if(login.login(account)){
            break;
            }
            else{
            chanceToEnter--;
            System.out.println("Chance to enter = "+ chanceToEnter);
            }
            if(chanceToEnter==0){
            System.out.println("You have entered invalid value ​​3 times...");
            return;
            }
        }
        System.out.println("****************************************************");
        String processes="1: BALANCE INQUIRY\n"
                        +"2: DEPOSIT\n"
                        +"3: WITHDRAW\n"
                        +"PLEASE ENTER q FOR EXIT";
        System.out.println(processes);
        System.out.println("****************************************************");
        while(true){
            System.out.print("Please choose the operation you want: ");
            processes= scanner.nextLine();
            if(processes.equals("q")){
            System.out.println("HAVE A GOOD DAY!");
            break;
        }
            else if (processes.equals("1")){
            System.out.println("Balance : "+account.getBalance());
            }
            else if(processes.equals("2")){
            System.out.println("Your Balance : "+ account.getBalance());
            System.out.print("Please enter the amount you want to deposit: ");
            double amount= scanner.nextDouble();
            scanner.nextLine();
            account.pay_in(amount);
            }
            else if(processes.equals("3")){
            System.out.println("Your Balance : "+ account.getBalance());
            System.out.print("Please enter the amount you want to witdraw: ");
            double amount= scanner.nextDouble();
            scanner.nextLine();
            account.pay_out(amount);
            }
            else{
                System.out.println("Invalid value...");
            }
                
        }


        
    }
}
