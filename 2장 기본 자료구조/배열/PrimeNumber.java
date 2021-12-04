package chap01;
import java.util.Scanner;

class PrimeNumber {
  
  public static void primeNumber(){
    
    int counter = 0;            //연산 횟수
    int ptr = 0;                //소수의 갯수
    int[] prime = new int[500]; //소수를 저장하는 배열

    prime[ptr++] = 2; //2는 소수이므로

    for(int i = 3; i < 1000 ; i += 2){
      int j;
      for(j = 1; j < ptr; j++){
        counter++;
        if(i % prime[ptr] == 0)
          break;
      }
      
      if(ptr == j)
        prime[ptr++] = j;
    }

    for(int i = 0; i < ptr ; i++){
      System.out.println(prime[i]);
    }

    System.out.println("count = " + counter);

  }
}