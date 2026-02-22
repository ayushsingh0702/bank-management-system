class savingAccount extends Account{

    public savingAccount(int accNo,String name,double balance){
        super(accNo,name,balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance-amount<500){
            System.out.println("minimum balance 500 rquired");
        }
        else{
            balance =balance -amount;
            System.out.println("withdraw"+amount);
        }
    }
}
