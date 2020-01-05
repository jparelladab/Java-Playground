package firstPackage;

public class FirstClass {

    //attributes and methods
    private int x = 5;
    private String attr;
    private boolean isAsleep = false;

    //This is the main method

    public static void main(String[] args) {
        System.out.println("Hello World");
        FirstClass myObj = new FirstClass();
        myObj.attr = "NICE";
        System.out.println(myObj.x);
        System.out.println(myObj.isAsleep);
    }


}
