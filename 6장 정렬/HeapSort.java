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

    if(size == 0 || size == 1) return;

    if(size == 2){
      if(a[0] > a[1]) swap(a, 0, 1); return;
    }

   for(int i = n; i >= 0; i--){
    
      if( (n*2+1) >= size ) 
        return;
      else if((n*2+2) >= size )
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
      else 
        return;

      if( (max*2+1) >= size ) 
        return;
      else if( (max*2+2) >= size ) 
        downHeap(a, max*2+1);
      else
        downHeap(a, max*2+1, max*2+2);

  }

  static void downHeap(int[] a, int left) {
    
      int max = left; 

      int parent = (left - 1)/2;      

      if(max > a[parent])
        swap(a, parent, max);
      

      return;
  }



}