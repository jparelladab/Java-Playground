package ParkingLot;

import java.util.Arrays;

public class Floor {
    private Spot[] smallSpots;
    private Spot[] bigSpots;

    public Spot[] getSmallSpots() {
        return this.smallSpots;
    }
    public Spot[] getBigSpots(){
        return this.bigSpots;
    }
    public Spot[][] getSpots(){
        Spot[][] spots = new Spot[2][];
        spots[0] = smallSpots;
        spots[1] = bigSpots;
        return spots;
    }


    public Floor(int smaSpots, int bgSpots){
        this.smallSpots = new Spot[smaSpots];
        this.bigSpots = new Spot[bgSpots];
        for (int i=0; i < smaSpots; i++) {
            //small spots are the first numbers, big ones the last ones
            this.smallSpots[i] = new SmallSpot(this,i+1);
        }
        for (int j=0; j < bgSpots; j++) {
            //small spots are the first numbers, big ones the last ones
            this.bigSpots[j] = new BigSpot(this, smaSpots+j+1);
        }
    }

}
