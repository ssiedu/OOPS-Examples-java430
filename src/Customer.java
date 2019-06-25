
import java.util.Objects;


public class Customer {

    private int code;
    private String name;
    private String address;

    
    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
    @Override
    public String toString() {
        return "Customer{" + "code=" + code + ", name=" + name + ", address=" + address + '}';
    }

    public Customer() {
    }

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Customer(int code, String name, String address) {
        this.code = code;
        this.name = name;
        this.address = address;
    }

    public void disp(){
        System.out.println(this.code);
    }
    
    public static void main(String[] args) {

        Customer c1=new Customer(111,"ABC","INDORE");
        Customer c2=new Customer(112,"XYZ");
        
        System.out.println(c1);
        System.out.println(c2);
        
    }

}
