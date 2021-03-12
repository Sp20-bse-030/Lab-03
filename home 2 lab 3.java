package circle;

public class Account {
    int balance;
    public Account(){
        balance = 5000;
    }
    public Account(int b){
        balance = b;
    }
    public void Deposit(int dep){
        int depst;
        depst = dep;
        int total = balance + depst;
        System.out.println( "your balance is "+ balance + " and you have deposit " + dep + " now your total balance is "+ total);
        balance = total;
    }
    public void Withdraw(int wid){
        int with;
        with = wid;
        int total = balance - with;
        System.out.println("your balance is "+ balance + " and you have withdraw " + wid + " now your total balance is "+ total);
        balance = total;
    }
    
}
