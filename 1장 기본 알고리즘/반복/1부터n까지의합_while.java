package chap01;
import java.util.Scanner;

class SumWhile {

  public static int Sum(int n){

      int sum = 0;
      int i = 1;

      while (i <= n) {
        
        sum += i;
        i++;
      }
      
      return sum;
  }
}