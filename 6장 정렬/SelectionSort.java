package chap01;
import java.util.Scanner;

class SelectionSort {  
  
  static void swap(int[] a, int idx1, idx2){
    int t = a[idx1];
    a[idx1]=a[idx2];
    a[idx2] = t;
  }

  static int selectionSort(int[] a, int n) {
    
    int min = a[0];

    for(int i = 0 ; i < n ; i++){
      for(int j = n; j > i ; j--){
        if(min > a[j]){
          min = a[j];
          swap(a, j, i);
        }
      }
    }

  }

}