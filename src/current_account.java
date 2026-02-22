class current_account extends Account{

    public current_account(int accNo,String name ,double balance){
        super(accNo,name,balance);
    }
    @Override
    public  void withdraw(double amount){
        if(balance-amount<-10000){
            System.out.println("overdarft limit exceede!");
        }
        else{
            balance = balance - amount;
            System.out.println("withdraw"+ amount);
        }

    }
}
