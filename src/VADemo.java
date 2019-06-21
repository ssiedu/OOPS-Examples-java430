public class VADemo {
    
    public static void add(){
        System.out.println("NOTHING TO ADD");
    }
    public static void add(double a, double b){
        System.out.println("SUM : "+(a+b));
    }
    public static void add(String...v){
        String res="";
        for(String tmp:v){
            res=res+tmp;
        }
        System.out.println(res);
    }
    public static void add(int...v){
        int sum=0;
        for(int tmp:v){
            sum=sum+tmp;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        add();
        add(10,20);
        add("aa","bb");
        add("xx","yy","zz");
        add(10,20,30);
        add(10,20,30,40);
        add(10,20,30,40,50);
    }    
}
