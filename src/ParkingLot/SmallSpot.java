package ParkingLot;

public class SmallSpot extends Spot {
    private float hourlyRate = 2;

    public float getHourlyRate(){return hourlyRate;}

    public SmallSpot(Floor floor, int number){
        super();
        this.floor = floor;
        this.number = number;
        this.free = true;
    }

}
