package firstPackage;

import java.util.Arrays;

public class Kata {
  static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static char findMissingLetter(char[] array) {
    int j = 0;
    for (int i = alphabet.indexOf(array[0]); i < alphabet.length(); i++){
      if (alphabet.charAt(i) == array[j]){
        j++;
      }
      else {
        return alphabet.charAt(i);
      }
    }
    return 'a';
  }
  public static void main(String[] args) {
    String alpha = "mnoprstuvwxyz";
    char[] alphi = "KM".toCharArray();

    System.out.println(findMissingLetter(alpha.toCharArray()));
    System.out.println(findMissingLetter(alphi));
  }
}
