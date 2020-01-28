package StrategyDesignPattern;

public interface Flys {

    String fly();
}

class ItFlies implements Flys {

    public String fly() {
        return "Flying High";
    }
}

class CantFly implements Flys {

    public String fly() {
        return "It can't fly";
    }
}