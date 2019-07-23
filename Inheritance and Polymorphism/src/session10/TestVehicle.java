package session10;

class Vehicle{
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;
    
    public Vehicle(String vId, String vName, int numWheels){
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
    }
    
    public void accelerate(int speed){
        System.out.println("Accelerating at: " + speed + "kmph");
    }
}

class FourWheeler extends Vehicle{
    private final boolean powerSteer;
    
    public FourWheeler(String vId, String vName, int numWheels,
            boolean pSteer){
        super(vId, vName, numWheels);
        
        powerSteer = pSteer;
    }
    
    public void showDetails(){
        System.out.println("Vehicle no: " + vehicleNo);
        System.out.println("Vehicle name: " + vehicleName);
        System.out.println("Number of wheels: " + wheels);
        
        if(powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }
    
    @Override
    public void accelerate(int speed){
        super.accelerate(speed);
        System.out.println("Maximum acceleration: " + speed + "kmph");
    }
}

public class TestVehicle {

    public static void main(String[] args) {
        FourWheeler obj = new FourWheeler("LA-09 CS-1406", "Volkswagen",
        4, true);
        obj.showDetails();
        obj.accelerate(200);
    }  
}