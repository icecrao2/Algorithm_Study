package chap01;
import java.util.Scanner;

class QuickSort {  
  

  static void swap(int[] a, int idx1, idx2){
    int t = a[idx1];
    a[idx1]=a[idx2];
    a[idx2] = t;
  }
  
  static void quickSort(int[] a, int left, int right) {

    int pl = left;
    int pr = right;

    int pivot = a[(pl + pr)/2];

    while(true){

      while(pivot > a[pl] && pl < right){
        pl++;
      }

      while(pivot < a[pr] && pr > left){
        pr--;
      }
      
      if(pl < pr){
        swap(a, pl, pr);
      }
      else{
        break;
      }
    }

    quickSort(a, left, pr);
    quickSort(a, pl, right);


  }

}