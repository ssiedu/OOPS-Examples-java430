public class Student {
    private int rno;
    private String name;
    private int marks;
    
    public void setData(int x, String y){
        rno=x;
        name=y;
    }

    public void setData(int a, String b, int c){
        setData(a,b);
        marks=c;
    }
    
    public Student(){
    }
                    
    public Student(int p, String q){
        this();
        rno=p; 
        name=q;
    }
    
    public Student(int a, String b, int c){
        //System.out.println("hello");
        //this(a,b);
        setData(a,b);
        marks=c;
    }
    
    public void show(){
        System.out.println(rno+","+name+","+marks);
    }
    
    public static void main(String args[]){
        
        
        Student s1=new Student(111,"AAA",90);
        s1.show();
        
        
//        
//        Student s1=new Student();
//        Student s2=new Student();
//        s1.setData(111, "AAA", 50);
//        s2.setData(112, "BBB");
//        s1.show();
//        s2.show();
    }
    
}
