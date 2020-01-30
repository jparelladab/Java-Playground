package ParkingLot;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        Floor firstFloor = new Floor(20,10);
        System.out.println(firstFloor.getSpots()[1][1].getHourlyRate());
        System.out.println(firstFloor.getSpots()[0][2].getNumber());


    }
}
