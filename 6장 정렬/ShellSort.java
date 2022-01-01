package chap01;
import java.util.Scanner;

class ShellSort {  
  
  static int shellSort(int[] a, int n) {

    
    for(int h = n/2; h > 0 ; h /= 2){
      
      for(int i = h ; i < n ; i++){

        int tmp = a[i];

        for(int j = i - h; j >= 0 ; j = j - h){

          if(tmp < a[j]){
          
          a[j+h] = a[j];
          
          }

          else if(tmp > a[j]){
          
            a[j+h] = tmp;
            break;
          }
        
        }

      }
      
    
    }



  }

}