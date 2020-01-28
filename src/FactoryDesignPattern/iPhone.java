package FactoryDesignPattern;

public class iPhone extends Mobile {
    protected String size = "sm";
    protected int onlyIphone = 17;
    public void getType() {
        System.out.println("I'm a iPhone object");
    }
}
