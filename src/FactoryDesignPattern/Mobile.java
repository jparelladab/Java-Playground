package FactoryDesignPattern;

public abstract class Mobile {

    //this variable is declared here but defined in the child extension
    protected String size;

    // this variable is only defined here in the abstract class.
    protected int mobileCode = 14;

    abstract public void getType();
    public void sayHi() {
        System.out.println("Hi from defined method inside abstract class");
    }

}
