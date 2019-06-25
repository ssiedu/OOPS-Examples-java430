
public class ObjCompTwo {
    public static void main(String[] args) {

        String s1=new String("indore");
        String s2=new String("indore");
        String s3=s2;
        
        boolean r1=(s1==s2);    //false
        System.out.println(r1);
        
        boolean r2=s1.equals(s2);//true
        System.out.println(r2);
        
        
        /*
        boolean r2=(s2==s3);
        System.out.println(r2);
        */
    }
}
