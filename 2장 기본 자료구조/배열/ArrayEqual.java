package chap01;
import java.util.Scanner;
class ArrayEqual {  
  
  public static boolean equal(int[] a, int[] b){
    
    if(a.length != b.length)
      return false;

    for(int i = 0 ; i < a.length ; i++){
      if(a[i] != b[i])  return false;
    }
    return true;
  }
}