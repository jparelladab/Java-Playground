package ParkingLot;

public abstract class Vehicle {
    private String licensePlate;
    public String getLicensePlate() {
        return this.licensePlate;
    };
    abstract void move();
    abstract void park();
}
