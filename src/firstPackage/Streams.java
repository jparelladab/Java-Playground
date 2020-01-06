package firstPackage;
import java.lang.reflect.Array;
import java.util.*;

public class Streams {
    //attributes and methods
    private int x = 5;
    private String attr;
    private boolean isAsleep = false;

    //reduce an array to the sum of its digits

    int reduce(int number) {
        String numStr = String.valueOf(number);
        char[] digits1 = numStr.toCharArray();
        List<Character> intList = Arrays.asList('1','2','3');
        ArrayList<Character> otherList = new ArrayList<Character>();
        otherList.add('4');
        otherList.add('5');
        otherList.add('6');
        intList.stream().map(x -> String.valueOf(x)).forEach(System.out::print);
        return -1;
    }
}



/*    String number = String.valueOf(n);
    char[] digits1 = number.toCharArray();
    int[] digits2 = new int[digits1.length];
        for (int i=0; i<digits1.length; i++)
        digits2[i] = Integer.parseInt(String.valueOf(digits1[i]));
        int sum = 0;
        for (int j=0; j<digits2.length; j++)
        sum += Math.pow(digits2[j],p+j);
        if (sum % n == 0)
        return sum / n;
        else
        return -1;
        }*/
