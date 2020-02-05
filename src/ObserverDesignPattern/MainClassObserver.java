package ObserverDesignPattern;

public class MainClassObserver {
    public static void main(String[] args) {
        StockGrabber myStockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(myStockGrabber);
        StockObserver stockObserver2 = new StockObserver(myStockGrabber);
        StockObserver stockObserver3 = new StockObserver(myStockGrabber);
        myStockGrabber.notifyObservers();
        myStockGrabber.setAaplPrice(321.30);
        myStockGrabber.setGoogPrice(1435.21);
        myStockGrabber.setIbmPrice(155.79);
    }

}
