public class Test {
    private int x,y;    
    
    public Test(int a, int b){
        x=a; y=b;
        System.out.println("Two args Constructor");
    }
    public Test(int...v){
        System.out.println("Var-args Constructor");
    }
    
    public void show(){
        int x=55;
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println("________________");
    }
    
    public static void main(String args[]){
        
        Test t1=new Test(10,20);
        Test t2=new Test(30,40);
        Test t3=new Test();//{}        
        Test t4=new Test(1,2,3);
        Test t5=new Test(1,2,3,4,5);
        //t1.show();
        
        //t2.show();
        
        
        
    }
}
