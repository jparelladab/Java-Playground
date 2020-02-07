package ObserverDesignPattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    private int startTime;
    private String stock;
    private double price;
    private Subject stockGrabber;
    public GetTheStock(Subject sg, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = sg;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;

    }
    @Override
    public void run() {
        for(int i=0; i<20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){}
            double randNum = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            this.price = Double.valueOf(df.format((this.price + randNum)));
            b
        }

    }
}
