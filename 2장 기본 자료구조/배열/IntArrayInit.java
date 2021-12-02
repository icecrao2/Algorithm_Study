package chap01;
import java.util.Scanner;

class IntArrayInit {
  
  public static void init(){
    
    int[] a = {1,2,3,4,5}; //배열 초기화에 의한 생성

    for(int i = 0 ; i < a.length; i++){
      System.out.println(a[i]);
    }

  }
}