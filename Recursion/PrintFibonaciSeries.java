public class PrintFibonaciSeries {
      
    public int fib(int n) {
        
   if(n<=1) return n;

   return fib(n-1)+fib(n-2);

    }
    
    public static void main(String[] args) {
        PrintFibonaciSeries p=new PrintFibonaciSeries();
        int n=p.fib(6);
        System.out.println(n);

    }
}
