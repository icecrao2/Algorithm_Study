package chap01;
import java.util.Scanner;
class ReverseArray {  
  
  private void swap(int[] a, int idx1, int idx2){
    int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
  }

  public static int reverse(int[] a){
    
      for(int i = 0 ; i < a.length/2; i++)
        swap(a, a.length - i - 1, i);

  }
}