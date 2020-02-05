package ObserverDesignPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        this.observers = new ArrayList<Observer>();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        this.notifyObservers();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        this.notifyObservers();
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        this.notifyObservers();
    }

    @Override
    public void register(Observer o) {
        this.observers.add(o);
        System.out.println("Observer registered");
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
        System.out.println("Observer removed");
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.ibmPrice, this.aaplPrice, this.googPrice);
        }
    }
}
