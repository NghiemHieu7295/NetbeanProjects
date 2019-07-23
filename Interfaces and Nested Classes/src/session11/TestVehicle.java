package session11;

class TwoWheeler implements IVehicle, IManufacturer{
    String ID;
    String type;
    
    public TwoWheeler(String ID, String type){
        this.ID = ID;
        this.type = type;
    }
    
    @Override
    public void start(){
        System.out.println("Starting the " + type);
    }
    
    @Override
    public void accelerate(int speed){
        System.out.println("Accelerating at speed: " + speed
        + " kmph");
    }
    
    @Override
    public void brake(){
        System.out.println("Applying brakes");
    }
    
    @Override
    public void stop(){
        System.out.println("Stopping the " + type);
    }
    
    public void displayDetails(){
        System.out.println("Vehicle No.: " + STATEDID + "" + ID);
        System.out.println("Vehicle Type.: " + type);
    }
    
    @Override
    public void addContact(String detail){
        System.out.println("Manufacturer: " + detail);
    }
    
    @Override
    public void callManufacturer(String phone){
        System.out.println("Calling Manufacturer: " + phone);
    }
    
    @Override
    public void makePayment(float amount){
        System.out.println("Payable Amount: $" + amount);
    }
}

public class TestVehicle {

    public static void main(String[] args) {
        if(args.length == 6){
            TwoWheeler obj = new TwoWheeler(args[0], args[1]);
            obj.displayDetails();
            obj.start();
            obj.accelerate(Integer.parseInt(args[2]));
            obj.brake();
            obj.stop();
            obj.addContact(args[3]);
            obj.callManufacturer(args[4]);
            obj.makePayment(Float.parseFloat(args[5]));
        }
        else{
            System.out.println("Usage: java TwoWheeler <ID> <Type> "
                    + "<Speed> <Manufacturer> <Phone> <Amount>");
        }
    }   
}