public class recusion {
    // METHOD 1
    // static int fact(int n) {
    // if (n == 0 || n == 1) {
    // return n;

    // } else {
    // return n * fact(n - 1);
    // }
    // }

    // METHOD 2

    static int fact(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= x; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(" the factorial of n is " + fact(n));
    }
}
