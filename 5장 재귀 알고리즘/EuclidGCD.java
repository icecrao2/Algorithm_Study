package chap01;
import java.util.Scanner;

class EuclidGCD {  
  

  static int gcd(int x, int y) {

    if(y == 0) return x;

    else return gcd(y, x % y);    

  }

}