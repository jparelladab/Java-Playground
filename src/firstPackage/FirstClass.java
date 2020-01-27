package firstPackage;
import java.util.Arrays;

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
        Streams myStream = new Streams();
        myStream.reduce(3);
        System.out.println();
        int[] myArray = {1,2,3,4};
        int[] otherArray = new int[4];
        int[] newArray = myArray;
        newArray[2] = 84;
        System.out.println(Arrays.toString(myArray));
    }


}
