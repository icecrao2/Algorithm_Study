package chap01;
import java.util.Scanner;

class SumFor {

  public static int Sum(int n){

      int sum = 0;

      for(int i = 0 ; i <= n ; i++)
        sum += i;

      return sum;
  }
}