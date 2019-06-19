//its the blueprint of Cylinder
public class Cylinder {

    //data members (to hold the property values)
    private static double PI=3.14;
    private double radius, height, area, volume;
    
    //methods (to perform the operations)
    
    public void setHeight(double h){
        height=h;
    }
    public void setRadius(double r){
        radius=r;
    }
    
    public void calculateArea(){
        area=2*3.14*radius*height;
        System.out.println("Area of Cylinder : "+area);
    }
    public void calculateVolume(){
        volume=3.14*radius*radius*height;
        System.out.println("Volume of Cylinder : "+volume);
    }
}
