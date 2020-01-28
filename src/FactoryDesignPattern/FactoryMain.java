package FactoryDesignPattern;

import java.awt.*;

public class FactoryMain {

    public static void main(String[] args) {
        //This is bad because the name of the class gets exposed
        OS obj = new Android();
        obj.specs();
        OS win = new Windows();
        win.specs();
        System.out.println(win.num);

        System.out.println();

        //Now we use the factory
        Factory myFactory = new Factory();
        OS firstObj = myFactory.getInstance("closed");
        firstObj.specs();
        OS secondObj = myFactory.getInstance("open");
        secondObj.specs();

        Windows var = new Windows();
        System.out.println();

        //following function doesn't change the value of myNum because it's not static
        int myNum = 56;
        var.changeNum(myNum);
        System.out.println(myNum);

        //this is a way to change
        var.changeInst(var);
        System.out.println(var.getNum());
        System.out.println();

        //creating object from abstract class. We see how variables from the parent abstract class are included even if not defined in child class
        iPhone myIphone = new iPhone();
        System.out.println(myIphone.mobileCode);
        System.out.println(myIphone.size);
        myIphone.getType();
        myIphone.sayHi();
        System.out.println(myIphone.onlyIphone);
        System.out.println();

        //creating another object but now using polymorphism
        Mobile otherIphone = new iPhone();
        System.out.println(otherIphone.mobileCode);
        System.out.println(otherIphone.size);
        otherIphone.getType();
        otherIphone.sayHi();
        //System.out.println(otherIphone.onlyIphone); cannot call this method
        System.out.println();
    }
}
