
public class BankingApp {

    public static void main(String args[]) {
        //we are managing 3 accounts
        BankAccount ac1 = new BankAccount();
        BankAccount ac2 = new BankAccount();
        BankAccount ac3 = new BankAccount();

        ac1.setData(111, "AAA", 10000);
        ac2.setData(112, "BBB", 20000);
        ac3.setData(113, "CCC", 30000);

        //BankAccount.showData(ac1);
        //BankAccount.showData(ac2);
        //BankAccount.showData(ac3);
        
        ac1.showData();
        ac2.showData();
        ac3.showData();
        
        BankAccount.showAvg(ac1,ac2);
        //ac2.showAvg(ac1);
        
        //BankAccount.showTotalCash();
        
     
    }
}
