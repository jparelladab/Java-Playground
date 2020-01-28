package StrategyDesignPattern;

public class myMain {
    public static void main(String[] args) {
        Animal myDog = new Dog("Spooky", "Wook", new CantFly(), "Shepherd");
        myDog.sayHi();
        System.out.println(myDog.getName());
        System.out.println(myDog.getSound());
        System.out.println(myDog.getFlyType());
        System.out.println();

    }
}
