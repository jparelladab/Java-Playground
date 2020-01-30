package ParkingLot;

public abstract class Spot {
    //Parking parking;
    protected Floor floor;
    private float hourlyRate;
    abstract float getHourlyRate();
    protected boolean free;
    protected int number;

    public int getNumber() {
        return this.number;
    }

    public boolean isFree() {
        return free;
    }

    //Certificate park(Vehicle vehicle){return new Certificate();};
    //void unpark(){};
    int getAmount(Certificate certificate){return 20;};
    void pay(){};


}
