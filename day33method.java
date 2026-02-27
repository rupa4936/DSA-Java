
public class day33method {
  static int sum(int x, int y) {
    if (x > y) {
      // System.out.println(x);
      return x;
    } else {
      return y;
    }
  }

  public static void main(String[] args) {
    System.out.println(" this is my first method program");

    int result = sum(4, 5);

    System.out.println(" the sum of x and y is " + result);

  }
}