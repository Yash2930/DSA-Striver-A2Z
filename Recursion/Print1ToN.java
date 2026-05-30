public class Print1ToN {
    public static void printToN(int n) {

        if (n <= 0)
            return;

        printToN(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        printToN(5);
    }
}
