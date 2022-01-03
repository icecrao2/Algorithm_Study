package chap01;
import java.util.Scanner;

class MergeSort {  
  

  static int[] buff;


  static void mergeSort(int[] a, int n){
    buff = new int[n];

    mergeSort(a, 0, n-1);

    buff = null;
  }

  static void mergeSort(int[] a, int left, int right){

    if(left < right){

      int i;
      int center = (left + right)/2;
      int p = 0;
      int j = 0;
      int k = left;

      mergeSort(a, left, center);
      mergeSort(a, center+1, right);

      for(i=left ; i<= center; i++){
        buff[p++] = a[i];
      }
      while(i <=right && j < p){
        a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
      }
      while(j < p){
        a[k++] = buff[j++];
      }

    }

  }

}