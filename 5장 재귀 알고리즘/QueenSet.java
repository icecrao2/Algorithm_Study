package chap01;
import java.util.Scanner;

class QueenSet {  
  
  static int[] pos = new int[8];
  static boolean[] flag_a = new boolean[8];
  static boolean[] flag_b = new boolean[15];
  static boolean[] flag_c = new boolean[15];

  //8X8 체스판에 퀸을 배치하는 재귀법
  //set(0)으로 대입해서 시작
  static void set(int i) {  // 함수 자체가 한 열

    for(int j = 0 ; j < 8 ; j++){   //모든 행을 구하는 반복문
      
      if(flag_a[j] == false &&
         flag_b[i+j] == false &&
         flag_c[i-j+7] == false){

        pos[i] = j;
        
        if(i == 7) print();
        else {
          flag_a[j] = true; // 이번 경우에는 같은 행의 값을 모두 제외한다.
          flag_b[i+j] = true;
          flag_c[i-j+7] = true;
          set(i + 1);
          lag_a[j] = false; // 해당 위치에 퀸을 두었을때 둘수있는 모든 경우를 봤음으로 그전 스위치를 삭제한다.
          flag_b[i+j] = false;
          flag_c[i-j+7] = false;
        }
      }
    }

  }

  void print(){
    for(int i=0; i<8 ; i++){
      Sysetm.out.printf("%2d", pos[i]);
    }
    Sysetm.out.println();
  }

}