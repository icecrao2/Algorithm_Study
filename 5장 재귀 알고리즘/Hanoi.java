package chap01;
import java.util.Scanner;

class Hanoi {  
  
  //no개의 원반을 x에서 y로 옮김
  static void move(int no, int x, int y) {  

    if(no > 1)
      move(no-1, x, 6 - x - y);
  
    System.out.println(no+"번 원반을 x에서 y로 옮김");
  
    if(no > 1)
      move(no-1, 6 - x - y, y);
  }

}