package chap01;
import java.util.Scanner;

//재귀로 할 수 있는 식을 재귀 없이 만들어 보자
class RecurOrigin {  
  
  static void recur(int n) {
    
    recur(n-1);
    System.out.println(n);
    recur(n-2);
    
  }

}