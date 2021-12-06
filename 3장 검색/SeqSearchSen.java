package chap01;
import java.util.Scanner;


class SeqSearchSen {  
  
  //요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
  static int seqSearchWen(int[] a, int n, int key){
    
    //보초를 세운다.
    a[n] = key;

    for(int i = 0 ; i < n; i++){
      if(a[i] == key){
        break;
      }
    }

    return i == n ? -1 : i;  //검색 실패하면 -1반환
  }
}