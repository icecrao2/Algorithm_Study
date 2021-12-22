package chap01;
import java.util.Scanner;

class QueenSet {  
  
  static int[] pos = new int[8];

  //8X8 체스판에 퀸을 배치하는 재귀법
  //set(0)으로 대입해서 시작
  static void set(int i) {  

    for(int j = 0 ; j < 8 ; j++){
      pos[i] = j;
      
      if(i == 7) print();
      else set(i + 1);
    }

  }

  void print(){
    for(int i=0; i<8 ; i++){
      Sysetm.out.printf("%2d", pos[i]);
    }
    Sysetm.out.println();
  }

}