package StrategyDesignPattern;

public class Dog extends Animal {
        //we need to define a constructor otherwise the default is just super(); so we don't get to define the specifics of Dog
    Dog() {
        System.out.println("I'm inside Dog's constructor");
        setSound("Bark");

    }










}
