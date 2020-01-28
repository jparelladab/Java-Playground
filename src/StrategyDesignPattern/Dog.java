package StrategyDesignPattern;

public class Dog extends Animal {
        //we need to define a constructor otherwise the default is just super(); so we just get the parent class variables with null
        //and we don't get to define the specifics of Dog
        //child class always has all parent's class attributes and methods PLUS maybe some child's specific ones
        private String breed;
    Dog(String name, String sound, Flys flyType, String breed) {
        super(name, sound, flyType);
        System.out.println("I'm inside Dog's constructor");
        this.breed = breed;
    }











}
