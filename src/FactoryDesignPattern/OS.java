package FactoryDesignPattern;

public interface OS {
    //this is an abstract method that cannot have a body and must be implemented
    void specs();
    //this is a public final variable by default, which means that must be given a value
    int num = 12;
}
