abstract public class Account {

    private int accountNumber;
    private  String holderName;
    protected double balance;

    public Account(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.holderName=holderName;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount){
        balance = balance+amount;
        System.out.println("amount deposite : "+ amount);
    }

    public abstract  void withdraw(double amount);
}
