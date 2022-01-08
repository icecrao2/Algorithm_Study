package chap01;
import java.util.Scanner;

class FSort {  
  


  static void fSort(int[] a, int n){

    int[] b = new int[n];
    
    int max = 0;

    for(int i = 0 ; i < n ; i++){
      if(a[i] > max) max = a[i];
    }

    int[] f = new int[max];

    for(int i = 0 ; i < n ; i++){
      f[a[i]]++;
    }

    for(int i = 0 ; i < max-1 ; i++){
      f[i+1] = f[i] + f[i+1];
    }

    for(int i = n - 1 ; i >= 0 ; i--){
      b[--f[a[i]]] = a[i];
    }
    
    for(int i = 0 ; i < n ; i++) a[i] = b[i];
  }

}