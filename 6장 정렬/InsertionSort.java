package chap01;
import java.util.Scanner;

class Insertionsort {  
  
  static int insertionSort(int[] a, int n) {

    for(int i = 1; i < n ; i++){
      
      for(int j = i - 1 ; j >= 0  ; j--){
        
        if(a[i] < a[j]){
          a[j+1] = a[j];
        }
        else if(a[i] > a[j]){
          a[j+1] = a[i];
          break;
        }

      }

    }

  }

}