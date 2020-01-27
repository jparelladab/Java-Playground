package FactoryDesignPattern;

import java.awt.*;

public class FactoryMain {

    public static void main(String[] args) {
        //This is bad because the name of the class gets exposed
        OS obj = new Android();
        obj.specs();
        Windows win = new Windows();
        win.specs();

        System.out.println();

        //Now we use the factory
        Factory myFactory = new Factory();
        OS firstObj = myFactory.getInstance("closed");
        firstObj.specs();
        OS secondObj = myFactory.getInstance("open");
        secondObj.specs();
        Windows var = new Windows();
        System.out.println();

        //following function doesn't change the value of myNum back here
        int myNum = 56;
        var.changeNum(myNum);
        System.out.println(myNum);

        var.changeInst(var);
        System.out.println(var.getNum());
    }
}
