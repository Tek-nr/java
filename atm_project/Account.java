package atm_project;

public class Account {
    
    private String username;
    private String password;
    private double balance;
    
        public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        
        
    }

    public String getNickname() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    public void pay_out(double amount){
        if(amount>balance){
            System.out.println("You cannot withdraw more than your balance.");
        }
        else{
            this.balance-=amount;
            System.out.println("New Balance : "+ balance);

        }
            
    }
    
    public void pay_in(double amount){
        if ((amount<10)&&(amount>10000)){
            System.out.println("You cannot deposit more than 10000$ and less than 10$. ");
        }
        else {
            this.balance+=amount;
            System.out.println("New Balance : "+ balance);
        }
            
    }
    
}
