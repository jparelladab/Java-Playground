package firstPackage;

import java.util.*;
import java.util.regex.Pattern;

public class PigLatin {

    public static String pigIt2(String str){
        return str.replaceAll("(\\w)(\\w+)","$2$1ay");
    }

    public static String pigIt(String str) {
        List<char[]> wordList = new ArrayList<>();
        String result = new String();
        for(String s : str.split(" ")) {
            wordList.add(s.toCharArray());
        }
        for(char[] a : wordList){
            if (new String(a).matches("\\W+")){
                result += " " + new String(a);
            } else {
                char first = a[0];
                for (int i = 0; i < a.length - 1; i++) {
                    a[i] = a[i + 1];
                }
                if (new String(a).matches("\\w+\\W+\\z")) {
                    char sign = a[a.length - 1];
                    a[a.length - 2] = first;
                    a[a.length - 1] = 'a';
                    String newStr = new String(a) + 'y' + sign;
                    result += " " + newStr;
                } else {
                    a[a.length - 1] = first;
                    String newStr = new String(a).concat("ay");
                    result += " " + newStr;
                }
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(pigIt("More solutions! []"));
        System.out.println(pigIt2("More solutions! []"));
    }
}
