package ParkingLot;

public class BigSpot extends Spot{
    private float hourlyRate = 4;

    public float getHourlyRate(){return hourlyRate;}

    public BigSpot(Floor floor, int number){
        super();
        this.floor = floor;
        this.number = number;
    }
}
