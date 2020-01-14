package firstPackage;
import java.util.*;

public class ProdFib {

  public static long[] productFib(long prod) {
    List<Long> fib = new ArrayList<Long>();
    fib.add(0L);
    fib.add(1L);
    long equal = 0L;
    for (int i = 1; i < 50; i++) {
      fib.add(fib.get(i) + fib.get(i - 1));
      if (fib.get(i + 1) * fib.get(i) >= prod) {
        if (fib.get(i + 1) * fib.get(i) == prod) {
          equal = 1L;
        }
        break;
      }
    }
    System.out.println(fib);
    long[] solution = new long[] {fib.get(fib.size() - 2), fib.get(fib.size() - 1), equal};
    return solution;
   }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(productFib(1900L)));
  }
}
