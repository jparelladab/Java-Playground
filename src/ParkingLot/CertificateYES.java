package ParkingLot;

import java.util.Calendar;

public class CertificateYES extends Certificate {
    Spot spot;
    Spot[] spots;

    public CertificateYES(Vehicle vehicle, Spot spot){
        this.vehicle = vehicle;
        this.spot = spot;
        this.arrival = Calendar.getInstance().getTime();
        this.autorization = true;
    }
    public CertificateYES(Vehicle vehicle, Spot[] spots){
        this.vehicle = vehicle;
        this.spots = spots;
        this.arrival = Calendar.getInstance().getTime();
        this.autorization = true;
    }

}
