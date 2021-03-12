package circle;

public class runner_home2_lab3 {
    public static void main (String []args){
        Account a1 = new Account();
        Account a2 = new Account(7000);
        
        a1.Deposit(500);
        a1.Withdraw(1000);
        a2.Deposit(2000);
        a2.Withdraw(3000);
    }
    
}
