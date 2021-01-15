
package atm_project;

public class ATM_Project {

    public static void main(String[] args) {
        ATM atm=new ATM();
        Account account1=new Account("hilal","123456",5000.0);
        atm.processing(account1);
        Account account2=new Account("akif","alpay",10000.0);
        atm.processing(account2);
        

    }
    
}
