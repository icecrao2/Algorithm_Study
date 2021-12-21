package chap01;
import java.util.Scanner;

//재귀로 할 수 있는 식을 재귀 없이 만들어 보자
class Recur {  
  
  static void recur(int n) {
    
    IntStack s = new IntStack(new)
  
    while(true){
      
      if(n > 0){
        s.push(n);
        n = n - 1;
        continue;
      }
      
      if(s.isEmpty()) break;

      n = s.pop();
      System.out.println(n);
      n = n - 2;
    

    }
  }

}