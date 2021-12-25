package chap01;
import java.util.Scanner;

class BubbleSortUpgrade1 {  
  

  static void swap(int[] a, int idx1, idx2){
    int t = a[idx1];
    a[idx1]=a[idx2];
    a[idx2] = t;
  }

  static int bubbleSort(int[] a, int n) {
    boolean flag;

    for(int i = 0; i < n - 1 ; i++){
      flag = false;

      for(int j = n ; j > i ; i ++){
        if(a[j] < a[j-1]) {
          swap(a, j, j-1);
          flag = true;
        }
      }
      if(flag == false)
        break;
    }
  }

}