public class BankAccount {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;
    
    public static void showAvg(BankAccount tmp1, BankAccount tmp2, BankAccount tmp3, BankAccount tmp4, BankAccount tmp5){
        System.out.println("Avg of 5  : "+(tmp1.balance+tmp2.balance+tmp3.balance+tmp4.balance+tmp5.balance)/5);
    }
    public static void showAvg(BankAccount tmp1, BankAccount tmp2, BankAccount tmp3, BankAccount tmp4){
        System.out.println("Avg of 4  : "+(tmp1.balance+tmp2.balance+tmp3.balance+tmp4.balance)/4);
    }
    public static void showAvg(BankAccount tmp1, BankAccount tmp2, BankAccount tmp3){
        System.out.println("Avg of 3  : "+(tmp1.balance+tmp2.balance+tmp3.balance)/3);
    }
    public static void showAvg(BankAccount tmp1, BankAccount tmp2){
        System.out.println("Avg of 2  : "+(tmp1.balance+tmp2.balance)/2);
    }
    
    
    
    public static void showTotalCash(){
        System.out.println("TOTAL CASH  : "+totalCash);
    }
 
    public void showData(){
       System.out.println(ano+","+name+","+balance);
    }
    
    public BankAccount(int ano, String name){
        this.ano=ano;
        this.name=name;
    }
    public BankAccount(int ano, String name, int balance){
        this(ano,name);
        this.balance=this.balance+balance;
        totalCash=totalCash+balance;
    }
}

