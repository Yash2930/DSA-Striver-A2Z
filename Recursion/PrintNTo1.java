public class PrintNTo1 {
    public static void printTo1(int n) {

        if (n <= 0)
            return;

          System.out.println(n);
        printTo1(n - 1);
      

    }

    public static void main(String[] args) {
        printTo1(5);
    }
}
