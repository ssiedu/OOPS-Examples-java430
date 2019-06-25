public class Student {
    private int rno;
    private String name;
    private int marks;
    
    public void setData(int rno, String name, int marks){
        this.rno=rno;    
        this.name=name;
        this.marks=marks;
    }

    public void show(){
        System.out.println(rno+","+name+","+marks);
    }
    
    public static void main(String args[]){
        
        Student s1=new Student();
        s1.setData(111, "AAA", 50);
        s1.show();
        
    }
    
}
