package chap01;
import java.util.Scanner;

class Median {

  public static int med3(int a, int b ,int c) {
      if(a >= b) {
        if(c >= a) return a;
        else if (b >= c) return b;
        else return c;
      }
      else if(a > c) return a;
      else if(b > c) return c;
      else return b;    
  }
}