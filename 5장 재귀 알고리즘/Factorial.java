package chap01;
import java.util.Scanner;

class Factorial {  
  
  //시간 복잡도 O(n)
  static int factorial(int n) {

    if(n < 0) return  -1;
    else if(n == 0) return 1;

    else {
      return n * factorial(n-1);
    }

    

  }

}