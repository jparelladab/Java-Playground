package StrategyDesignPattern;

public class Bird extends Animal {
    String color;

    Bird(String name, String sound, Flys flyType, String color){
        super(name, sound, flyType);
        this.color = color;
    }
}
