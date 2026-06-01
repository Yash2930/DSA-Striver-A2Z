public class PrintFactorialOfN {
    
    public static int printFactorial(int n){
        if(n==1) return 1;

        return n*printFactorial(n-1);
    }
    public static void main(String[] args) {
        int s=printFactorial(5);
        System.out.println(s);
    }
}
