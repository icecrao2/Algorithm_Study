package chap01;
import java.util.Scanner;
class MaxOfArray {  
  
  public static int maxOfArray(int[] a){
    int max = a[0];

    for(int i = 1; i< a.length; i++){
      if(max < a[i]) 
      max = a[i];
    } //주사기법
    
    return max;
  }
}