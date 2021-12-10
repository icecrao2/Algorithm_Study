package chap01;
import java.util.Scanner;
import java.util.Arrays;


class BiSearch {  
  
  //오름차순 된 배열 a에서 key값과 같은 인덱스번호를 반환한다.
  static int binarySearch(int[] a, int n, int key){
    
    int pl = 0;
    int pr = n-1;

    do {
      int pc = (pl + pr)/2;
      if(a[pc] == key)
        return pc;
    
      else if(a[pc] < key)
        pl = pc + 1;

      else
        pr = pc - 1;
    }while(pl <= pr)

    return -1;
  }
}