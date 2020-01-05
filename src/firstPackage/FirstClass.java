package firstPackage;

public class FirstClass {
    private int x = 5;
    private String attr;
    private boolean isAsleep = false;

    public static void main(String[] args) {
        System.out.println("Hello World");
        FirstClass myObj = new FirstClass();
        myObj.attr = "NICE";
        System.out.println(myObj.x);
        System.out.println(myObj.isAsleep);
    }


}
