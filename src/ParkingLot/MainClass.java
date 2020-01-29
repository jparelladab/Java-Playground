package ParkingLot;

public class MainClass {

    public static void main(String[] args) {
        Parking myParking = new Parking(2,3,2);
        Vehicle myMoto = new Motorbike();
        myParking.park(myMoto);
        System.out.println();
        Vehicle myBus = new Bus();
        myParking.park(myBus);
    }
}
