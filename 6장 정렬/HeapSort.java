package chap01;
import java.util.Scanner;

class HeapSort {  
  

  static void swap(int[] a, int idx1, idx2){
    int t = a[idx1];
    a[idx1]=a[idx2];
    a[idx2] = t;
  }


  
  static void heapSort(int[] a, int n){
  
    int size = n;
    n = (n-2)/2;

   for(int i = n; i >= 0; i--){
    
      if( (n*2+2) >= size ) 
        downHeap(a, (n*2+1));
      else
        downHeap(a, (n*2+1), (n*2+2));

   } 

  }


  static void downHeap(int[] a, int left, int right) {

      int max;
      
      int parent = (left-1)/2;

      if(a[left] < a[right])
        max = right;
      else
        max = left;

      if(max > a[parent])
        swap(a, parent, max);

      downHeap(a, max);
  }

  static void downHeap(int[] a, int left) {

      int max = left; 

      int parent = (left - 1)/2;      

      if(max > a[parent])
        swap(a, parent, max);

      downHeap(a, max);
  }



}