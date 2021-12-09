package chap01;
import java.util.Scanner;
import java.util.Arrays;


class BinarySearchTester {  
  
  //오름차순 된 배열 a에서 key값과 같은 인덱스번호를 반환한다.
  static int intBinarySearchTester0(int[] a, int key){
    
    int x;

    //오름차순 여부 파악
    for(int i = 1 ; i < a.length; i++){
      if(a[i] < a[i-1]){
        System.out.println("해당 배열은 오름차순 되어있지 않습니다.");
        return -1;
      }
    }

    x = Arrays.binarySearch(a, key);

    return x;  //검색 실패하면 -1반환
  }
}