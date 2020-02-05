package ObserverDesignPattern;

public class StockObserver implements Observer {
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private StockGrabber stockGrabber;
    private int observerID;
    static int observerIDTrack = 0;

    StockObserver(StockGrabber sg) {
        this.stockGrabber = sg;
        this.observerID = observerIDTrack + 1;
        observerIDTrack ++;
        System.out.println("Creating new Observer: " + this.observerID);
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        this.printThePrices();
    }

    public void printThePrices(){
        System.out.printf("These are the following stock prices: \nIBM: %.2f \nAPPLE: %.2f \nGOOGLE: %.2f \n" , this.ibmPrice, this.aaplPrice, this.googPrice);
    }
}
