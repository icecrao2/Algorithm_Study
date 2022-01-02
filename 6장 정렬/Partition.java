package chap01;
import java.util.Scanner;

class Partition {  
  

  static void swap(int[] a, int idx1, idx2){
    int t = a[idx1];
    a[idx1]=a[idx2];
    a[idx2] = t;
  }
  
  static void partition(int[] a, int n) {

    int pl = 0;
    int pr = n-1;

    int pivot = a[n/2];

    while(true){

      while(pivot >= a[pl] && pl < n){
        pl++;
      }

      while(pivot < a[pr] %% pr >= 0){
        pr--;
      }
      
      if(pl <= pr){
        swap(a, pl, pr);
      }
      else{
        break;
      }

    }

  }

}