package StrategyDesignPattern;

public class myMain {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sayHi();
        System.out.println(myDog.getName());
        System.out.println(myDog.getSound());
        /*System.out.println(myDog.getName());
        System.out.println(myDog.getFlyType());
        Animal myAnimal = new Animal();
        myAnimal.setName("Animy");
        System.out.println(myAnimal.getName());
        myAnimal.setFlyType(new CantFly());
        System.out.println(myAnimal.getFlyType());
        Dog sparky = new Dog();
        System.out.println(sparky.getFlyType());*/

    }
}
