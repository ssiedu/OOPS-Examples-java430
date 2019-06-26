
public class BankingApp {

    public static void main(String args[]) {
        //we are managing 5 accounts
        BankAccount ac1 = new BankAccount(111,"AAA",10000);
        BankAccount ac2 = new BankAccount(112,"BBB",20000);
        BankAccount ac3 = new BankAccount(113,"CCC",30000);
        BankAccount ac4 = new BankAccount(114,"DDD",40000);
        BankAccount ac5 = new BankAccount(115,"EEE");
        
        ac1.showData();
        ac2.showData();
        ac3.showData();
        ac4.showData();
        ac5.showData();

        BankAccount.showAvg(ac1, ac2);
        BankAccount.showAvg(ac1, ac2, ac3);//{ac1,ac2,ac3}
        BankAccount.showAvg(ac1, ac2, ac3, ac4);
        BankAccount.showAvg(ac1, ac2, ac3, ac4, ac5);

        //BankAccount.showTotalCash();
    }
}
