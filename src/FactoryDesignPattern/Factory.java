package FactoryDesignPattern;

class Factory {

    // This method returns one polymorphism of several possible classes that share a common superclass(OS)
    OS getInstance(String str) {
        if(str.equals("open"))
            return new Android();
        else if(str.equals("closed"))
            return new IOS();
        else
            return new Windows();
    }
}