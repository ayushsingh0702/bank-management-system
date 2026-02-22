import java.util.*;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Bank bank = new Bank();

       while(true){

           System.out.println("1:create saving account");
           System.out.println("2:create current account");
           System.out.println("3:deposite");
           System.out.println("4:withdraw");
           System.out.println("5:check balance");
           System.out.println("6:exit");

           int choice = sc.nextInt();

           if(choice==1||choice==2){
               System.out.println("account no:");
               int accNo= sc.nextInt();
               sc.nextLine();
               System.out.println("name:");
               String name=sc.nextLine();
               System.out.println("Initial Balance");
               double bal=sc.nextDouble();

               Account acc=null;

               if(choice == 1){
                   acc = new savingAccount (accNo,name,bal);
               }
               if(choice==2){
                   acc=new current_account(accNo,name,bal);
               }
               bank.addAccount(acc);
           }
           else if(choice>=3 && choice <=5){
               System.out.println("enter your acc no:");
               int accNo=sc.nextInt();
               Account acc = bank.findAccount(accNo);

               if(acc==null){
                   System.out.println("account is no there");
                   continue;
               }
               if(choice == 3){
                   System.out.println("Amount:");
                   acc.deposite(sc.nextDouble());
               }
               else if (choice == 4) {
                   System.out.println("amount:");
                   acc.withdraw(sc.nextInt());
               }
               else{
                   System.out.println("balance: "+ acc.getBalance());
               }
           }
           else break;
       }
    }
}