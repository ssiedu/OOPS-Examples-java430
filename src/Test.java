public class Test {

    int x,y;    //instance (non-static)
    static int p,q; //class (static)

    public static void main(String args[]){
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        
        t1.x=10;
        t2.x=20;
        t3.x=30;
        
        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t3.x);
        
        
        t1.p=100;
        t2.p=200;
        t3.p=300;

        System.out.println(t1.p);
        System.out.println(t2.p);
        System.out.println(t3.p);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
