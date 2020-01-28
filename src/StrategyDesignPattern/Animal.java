package StrategyDesignPattern;

public class Animal {
    private String name;
    private String sound;
    private Flys flyType;

    public void sayHi() {
        System.out.println("Hiiii");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSound() {
        System.out.println("I'm inside Animal's getSound");
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
        System.out.println("I'm inside Animal's setSound");
    }
    public String getFlyType() {
        return flyType.fly();
    }
    public void setFlyType(Flys objType) {
        this.flyType = objType;
    }

    Animal() {
        System.out.println("I'm inside Animal's constructor");
    }
}
