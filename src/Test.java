public class Test {
    private int x,y;    
    
    public void show(){
        int x=55;
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println("________________");
    }
    public Test(int a, int b){
        x=a; y=b;
    }
    

    public static void main(String args[]){
        
        Test t1=new Test(10,20);
        Test t2=new Test(30,40);
        
        t1.show();
        
        t2.show();
        
        
        
    }
}
