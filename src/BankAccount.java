public class BankAccount {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;
    
    public static void showAvg(BankAccount tmp1, BankAccount tmp2){
        System.out.println("Avg of 2  : "+(tmp1.balance+tmp2.balance)/2);
    }
    
    
    
    public static void showTotalCash(){
        System.out.println("TOTAL CASH  : "+totalCash);
    }
 
    public void showData(){
       System.out.println(ano+","+name+","+balance);
    }
    
    
    public void setData(int a, String b, int c){
        ano=a;
        name=b;
        balance=balance+c;
        totalCash=totalCash+c;
    }
}

