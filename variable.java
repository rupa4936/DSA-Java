public class variable {

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 4, 5, 6, 8));
    }
}
