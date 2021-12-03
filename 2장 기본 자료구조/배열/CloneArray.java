package chap01;
import java.util.Scanner;

class CloneArray {  
  
  public static void cloneArray(){
    int[] a = {1,2,3,4,5};
    int[] b = a.clone();

    b[3] = 0;

    System.out.print("a=")
    for(int i = 0 ; i < a.length ; i++){
      System.out.print(" "+a[i]);
    }

    system.out.print("b=")
    for(int i = 0 ; i < b.length; i++){
      System.out.print(" "+b[i]);
    }

    //값이 다르다면 서로 다른 본체를 가진것(깊은복사)
    //결과값은 두 배열이 서로 다르게 나옴
  }
}