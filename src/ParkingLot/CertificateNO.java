package ParkingLot;

import java.util.*;

public class CertificateNO extends Certificate {

    public CertificateNO(Vehicle vehicle){
        this.vehicle = vehicle;
        this.arrival = Calendar.getInstance().getTime();
        this.autorization = false;
    }
}
