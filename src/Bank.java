import java.util.*;
public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc){
        accounts.add(acc);
        System.out.println("acc");
    }
    public Account findAccount(int accNo){
        for(Account acc:accounts){
            if(acc.getAccountNumber()==accNo){
                return acc;
            }
        }
        return null;
    }
}
