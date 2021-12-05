package chap01;
import java.util.Scanner;

class Int2DArray {  
  
  public static int int2DArray(){
    int[][] x = new int[2][4] // 4의 길이를 갖는 int형 배열을 구성요소로 갖는 길이가 2인 배열

    x[0][1] = 37; //x가 참조하는 배열 본체의 첫번째 구성요소인 배열의 2번째 구성요소인 int형 값을 불러옴
    x[0][3] = 54;
    x[1][2] = 65;
    //초기화 되지 않는 요소들은 배열초기화 규칙에 의해 0이 됨
    
    for(int i = 0; i < 2; i++){       //2차원 배열의 모든값을 출력함
      for(int j = 0; j < 4 ; j++){
        System.out.println(x[i][j]); 
      }
    }

  }
}