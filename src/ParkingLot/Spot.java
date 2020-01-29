package ParkingLot;

public class Spot {
    enum Sizes  { SMALL, LARGE };
    enum State {FREE, BUSY };
    private Sizes size;
    private State state;
}
