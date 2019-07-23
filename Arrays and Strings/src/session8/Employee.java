package session8;

public abstract class Employee {
    private final String name;
    private String address;
    private final int number;
    
    public Employee(String name, String address, int number){
        System.out.println("Xay dung mot employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    public abstract double computePay();
    
    public void mailCheck(){
        System.out.println("Gui mail kiem tra toi " + this.name
        + " " + this.address);
    }
    
    @Override
    public String toString(){
        return name + " " + address;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String newAddress){
        address = newAddress;
    }
    
    public int getNumber(){
        return number;
    }
}
