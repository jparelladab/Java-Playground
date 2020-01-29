package ParkingLot;
import java.util.*;

public class Parking {
    //Let's assume all floors have same amount of spots with same proportion of big and small
    int floors;
    int spotsPerFloor;

    Parking (int floors, int smallSpotsPerFloor, int bigSpotsPerFloor) {
        int[][] spotsAtFloor = new int[floors][2];
        for(int i=0; i>floors; i++){
            spotsAtFloor[i][0] = smallSpotsPerFloor;
            spotsAtFloor[i][1] = bigSpotsPerFloor;
        }
    }


}
