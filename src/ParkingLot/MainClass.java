package ParkingLot;

public class MainClass {

    public static void main(String[] args) {
       //first set up a new Parking
        Floor[] myFloors = {new Floor(0,10, 10), new Floor(1,20, 20), new Floor(2,30, 30)};
        Parking myParking = new Parking(myFloors);
        //create a Vehicle
        VehicleCar myCar = new VehicleCar();
        //park the vehicle in your parking
        myParking.park(myCar);
        VehicleMotorbike myBike = new VehicleMotorbike();
        myParking.park(myBike);
        VehicleBus myBus = new VehicleBus();
        myParking.park(myBus);




    }
}
