package ParkingLot;

public class Parking {
    //Let's assume all floors have same amount of spots with same proportion of big and small
    private int floors;
    private boolean busy;
    private int freeSmallSpots;
    private int freeBigSpots;
    private int smallSpotsPerFloor;
    private int bigSpotsPerFloor;

    //spotsAtFloor reflects the current state of the parking in terms of free small/big spots per floor
    private int[][] spotsAtFloor;

    Parking (int floors, int smallSpotsPerFloor, int bigSpotsPerFloor) {
        this.smallSpotsPerFloor = smallSpotsPerFloor;
        this.bigSpotsPerFloor = bigSpotsPerFloor;
        this.spotsAtFloor = new int[floors][2];
        this.floors = floors;
        this.busy = false;
        this.freeSmallSpots = smallSpotsPerFloor * floors;
        this.freeBigSpots = bigSpotsPerFloor * floors;
        for(int i=0; i<floors; i++) {
            spotsAtFloor[i][0] = smallSpotsPerFloor;
            spotsAtFloor[i][1] = bigSpotsPerFloor;
        }
    }

    //If there are free spots allocates one according to vehicle size starting by the ground floor and going up.
    void park(Vehicle vehicle) {
        System.out.println("Checking if free spots available...");
        System.out.println("Free spots before allocation: " + (freeSmallSpots + freeBigSpots));
        if (this.busy) {
            System.out.println("Parking full. No empty spots. Please wait");
        } else if (vehicle.getClass().getSimpleName().equals("Motorbike") ) {
            if (this.freeSmallSpots > 0) {
                System.out.println("There are free spots for your Motorbike");
                for (int k=0; k<this.floors; k++) {
                    if (spotsAtFloor[k][0] > 0) {
                        System.out.printf("Please park your Motorbike at floor %d, spot %d \n", k, smallSpotsPerFloor - spotsAtFloor[k][0] + 1);
                        spotsAtFloor[k][0]--;
                        freeSmallSpots--;
                        System.out.println("Free spots left after allocation: " + (freeSmallSpots + freeBigSpots));
                        break;
                    }
                }
            }
        } else if (vehicle.getClass().getSimpleName().equals("Car") ) {
            if (this.freeBigSpots > 0) {
                System.out.println("There are free spots for your Car");
                for (int k=0; k<this.floors; k++) {
                    if (spotsAtFloor[k][1] > 0){
                        System.out.printf("Please park your Car at floor %d, spot %d \n", k, bigSpotsPerFloor - spotsAtFloor[k][1] + 1);
                        spotsAtFloor[k][1]--;
                        freeBigSpots--;
                        System.out.println("Free spots left after allocation: " + (freeSmallSpots + freeBigSpots));
                        break;
                    }
                }
            }
        } else if (vehicle.getClass().getSimpleName().equals("Bus") ) {
            for( int j=0; j < this.floors; j++) {
                if (this.spotsAtFloor[j][1] > 1){
                    System.out.println("There are free spots for your Bus");
                    for (int k=0; k<this.floors; k++) {
                        if (spotsAtFloor[k][1] > 1){
                            spotsAtFloor[k][1] = spotsAtFloor[k][1] - 2;
                            freeBigSpots = freeBigSpots - 2;
                            System.out.printf("Please park your Bus at floor %d, across spots %d and %d \n", k, bigSpotsPerFloor - spotsAtFloor[k][1] + 1, bigSpotsPerFloor - spotsAtFloor[k][1] + 2);
                            System.out.println("Free spots left after allocation: " + (freeSmallSpots + freeBigSpots));
                            break;
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Parking myParking = new Parking(2,3,2);
        Vehicle myMoto = new Motorbike();
        myParking.park(myMoto);
    }


}
