public class BankAccount {
    private int ano;
    private String name;
    private int balance;
                        
    public void showData(){
        System.out.println(ano+","+name+","+balance);
    }
    
    public void setData(int a, String b, int c){
        ano=a;
        name=b;
        balance=c;
    }
}
