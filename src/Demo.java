
public class Demo {

    static Demo d1;

    private int x, y;

    public Demo(int a, int b) {
        x = a;
        y = b;
    }

    public static void main(String args[]) {
        new Demo(10, 20);
        Demo d2 = new Demo(30, 40);
        Demo d3 = d2;
        d1 = d2;
        System.out.println(d1.x + "," + d2.x);
        System.out.println(d2.x + "," + d2.y);
        System.out.println(d3.x + "," + d3.y);
        System.out.println("____________________");
        d2=new Demo(50,60);
        System.out.println(d1.x + "," + d2.x);
        System.out.println(d2.x + "," + d2.y);
        System.out.println(d3.x + "," + d3.y);
        System.out.println("____________________");
        d1=d2;
        System.out.println(d1.x + "," + d2.x);
        System.out.println(d2.x + "," + d2.y);
        System.out.println(d3.x + "," + d3.y);
        System.out.println("____________________");
        d3=new Demo(70,80);
        System.out.println(d1.x + "," + d2.x);
        System.out.println(d2.x + "," + d2.y);
        System.out.println(d3.x + "," + d3.y);
        System.out.println("____________________");
        
        
        
    }
}
