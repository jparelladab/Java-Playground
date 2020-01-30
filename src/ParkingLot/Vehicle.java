package ParkingLot;

public abstract class Vehicle {
    private String licensePlate;
    public String getPlateNumber() {
        return this.licensePlate;
    };
    abstract void move();
    abstract void park();
}
