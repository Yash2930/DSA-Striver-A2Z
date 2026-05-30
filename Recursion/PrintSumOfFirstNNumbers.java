public class PrintSumOfFirstNNumbers {
   

    public static int printSumofNumbers(int n){
      if(n==0) return 0;
     return n+printSumofNumbers(n-1);
    }

    public static void main(String[] args) {
       int s= printSumofNumbers(5);
       System.out.println(s);
    }
}
