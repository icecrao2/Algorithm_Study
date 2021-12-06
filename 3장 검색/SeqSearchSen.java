package chap01;
import java.util.Scanner;


class BinSearch {  
  
  //요솟수가 n인 정렬된 배열 a에서 key와 같은 요소를 이진 검색합니다.
  static int binSearch(int[] a, int n, int key){
    
    int ps = 0;
    int pc = (n-1)/2;
    int pl = n-1;

    do{
      if(a[pc] < key)
        ps = pc + 1;
      
      else if(a[pc] > key)
        pl = pc - 1;
      
      else if(a[pc] == key)
        return pc;
      
      else if(pl == ps)     //답이 안나오면 종료
        return -1;

      
      pc = (pl/2);

    }while(1)

  }
}