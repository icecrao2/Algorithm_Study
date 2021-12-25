package chap01;
import java.util.Scanner;

class BubbleSortUpgrade2 {  
  

  static void swap(int[] a, int idx1, idx2){
    int t = a[idx1];
    a[idx1]=a[idx2];
    a[idx2] = t;
  }

  static int bubbleSort(int[] a, int n) {

    int i = 0;
    n = n - 1;
    int k = n;

    while(i < n){

      for(int j = n ; j > i ; j--){
        if(a[j] < a[j-1]) {
          swap(a, j, j-1);
          k = j;      
        }
      }
      i = k;
    }
    
  }

}