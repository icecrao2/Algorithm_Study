package chap01;
import java.util.Scanner;


class SeqSearch {  
  
  //요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
  static int seqSearch(int[] a, int n, int key){
    
    for(int i = 0 ; i < n; i++){
      if(a[i] == key){
        return i;
      }
    }

    return -1;  //검색 실패하면 -1반환
  }
}