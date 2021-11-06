package chap01;
import java.util.Scanner;

class SumWhile {

  public static int Sum(int a, int b){

      int sum = 0;

      for(int i = a; i <=b ; i++)
        sum += i;
      
      //가우스의 공식을 이용한 방법
      //sum = b(b+1)/2 - a(a+1)/2;

      return sum;
  }
}