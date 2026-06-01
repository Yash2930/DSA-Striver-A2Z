public class PrintReverseAnArrayWithRecurrsion {
    
     public static void reverse(int[] arr, int n) {
      reverseArray(arr,0, n-1);
    }

    public static void reverseArray(int[] arr,int  l,int r)
    {
     if(l>=r){
        return;
     }

     int temp=arr[r];
     arr[r]=arr[l];
     arr[l]=temp;

     l++;
     r--;

     reverseArray(arr, l, r);



    }

public static void main(String[] args) {
    int a[]={2,4,1,8,3};
    int n=5;
    reverse(a, n);
    
    for(int i:a){
 System.out.print(i);
    }

}

}
