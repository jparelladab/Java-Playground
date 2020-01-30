package ParkingLot;


public class Parking {
    private Floor[] floors;
    private boolean busy;
    private int totalFreeSmallSpots;
    private int totalFreeBigSpots;
    //private int smallSpotsPerFloor;
    //private int bigSpotsPerFloor;
    //freeSpotsAtFloor reflects the current state of the parking in terms of free small/big spots per floor
    //freeSpotsAtFloor[k][0] are small spots are floor k while freeSpotsAtFloor[k][1] are big spots are floor k
    //private int[][] freeSpotsAtFloor;

    public Parking(Floor[] floors) {
        this.floors = floors;
        this.busy = false;

    }

    public int getTotalFreeSmallSpots() {
        int sum = 0;
        for (int m = 0; m < this.floors.length; m++) {
            sum += floors[m].getSmallSpots().length;
        }
        return sum;
    }

    public int getTotalFreeBigSpots() {
        int sum = 0;
        for (int m = 0; m < this.floors.length; m++) {
            sum += floors[m].getBigSpots().length;
        }
        return sum;
    }


    /*Parking (Floor[] floors, int smallSpotsPerFloor, int bigSpotsPerFloor) {
        this.smallSpotsPerFloor = smallSpotsPerFloor;
        this.bigSpotsPerFloor = bigSpotsPerFloor;
        this.freeSpotsAtFloor = new int[floors][2];
        this.floors = floors;
        this.busy = false;
        this.totalFreeSmallSpots = smallSpotsPerFloor * floors;
        this.totalFreeBigSpots = bigSpotsPerFloor * floors;
        for(int i=0; i<floors; i++) {
            freeSpotsAtFloor[i][0] = smallSpotsPerFloor;
            freeSpotsAtFloor[i][1] = bigSpotsPerFloor;
        }
    }
*/
    //If there are free spots allocates one according to vehicle size starting by the ground floor and going up.
    //Small spots are the first ones at every floor
   public Certificate park(Vehicle vehicle) {
        System.out.println("Welcome!");
        if (this.busy) {
            System.out.println("Parking full. No empty spots. Please wait");
        } else if (vehicle.getClass().getSimpleName().equals("Motorbike") ) {
            if (this.getTotalFreeSmallSpots()+this.getTotalFreeBigSpots() > 0) {
                System.out.println("There are free spots for your Motorbike");
                for (int k=0; k<this.floors.length; k++) {
                    if (this.floors[k].getSmallSpots().length > 0) {
                        System.out.printf("Please park your Motorbike at floor %d, spot %d \n", k, smallSpotsPerFloor - freeSpotsAtFloor[k][0] + 1);
                        freeSpotsAtFloor[k][0]--;
                        totalFreeSmallSpots--;
                        break;
                    }
                }
                for
            }
        } else if (vehicle.getClass().getSimpleName().equals("Car") ) {
            if (this.totalFreeBigSpots > 0) {
                System.out.println("There are free spots for your Car");
                for (int k=0; k<this.floors; k++) {
                    if (freeSpotsAtFloor[k][1] > 0){
                        System.out.printf("Please park your Car at floor %d, spot %d \n", k, smallSpotsPerFloor + bigSpotsPerFloor - freeSpotsAtFloor[k][1] + 1);
                        freeSpotsAtFloor[k][1]--;
                        totalFreeBigSpots--;
                        break;
                    }
                }
            }
        } else if (vehicle.getClass().getSimpleName().equals("Bus") ) {
            for( int j=0; j < this.floors; j++) {
                if (this.freeSpotsAtFloor[j][1] > 1){
                    System.out.println("There are free spots for your Bus");
                    for (int k=0; k<this.floors; k++) {
                        if (freeSpotsAtFloor[k][1] > 1){
                            freeSpotsAtFloor[k][1] = freeSpotsAtFloor[k][1] - 2;
                            totalFreeBigSpots = totalFreeBigSpots - 2;
                            System.out.printf("Please park your Bus at floor %d, across spots %d and %d \n", k, smallSpotsPerFloor + bigSpotsPerFloor - freeSpotsAtFloor[k][1] + 1, smallSpotsPerFloor + bigSpotsPerFloor - freeSpotsAtFloor[k][1] + 2);
                            break;
                        }
                    } break;
                }
            }
        }
    }
}
*/
