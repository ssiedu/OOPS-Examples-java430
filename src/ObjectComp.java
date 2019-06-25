
public class ObjectComp {
    public static void main(String[] args) {

        Demo d1=new Demo(10,20);
        Demo d2=new Demo(10,20);
        Demo d3=d1;
        System.out.println(d1.isEquals(d2));
        System.out.println(d1==d2);
        
        //System.out.println(d1==d3);
        //System.out.println(d1.isEquals(d3));
        
        
        /*
        boolean r1=(d1==d2);    //comparing references
        System.out.println(r1);
        
        boolean r2=d1.isEquals(d2); //comparing objects
        System.out.println(r2);
        */
        /*
        boolean r2=(d1==d3);    //both points to same obj
        System.out.println(r2);
        */
    }
}
