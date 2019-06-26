public class BankAccount {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;
    
    public static void showAvg(BankAccount...tmp){
        int n=tmp.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+tmp[i].balance;
        }
        
        System.out.println("AVG of : "+n+" : "+(sum/n));
        
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

