package session11;

public interface IVehicle {
    static final String STATEDID = "LA-09 ";
    /**
     * Abstract method to start a vehicle
     * return void
     */
    public void start();
    public void accelerate(int speed);
    public void brake();
    public void stop();
}
