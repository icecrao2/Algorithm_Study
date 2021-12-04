package chap01;
import java.util.Scanner;

class PrimeNumber2 {
  
  public static void primeNumber2(){
    
    int counter = 0;            //연산 횟수
    int ptr = 0;                //소수의 갯수
    int[] prime = new int[500]; //소수를 저장하는 배열

    prime[ptr++] = 2; //2는 소수이므로
    prime[ptr++] = 3; //3도 소수이다.

    for(int i = 5 ; i < 1000; i += 2){
        boolean confirm = false;
        for(int j = 0; prime[ptr] * prime[ptr] <= j; j++){ //제곱근보다 작은 값까지 연산
          if(i % prime[ptr] == 0){
            confirm = true;
            break;
          }
        }
        if(!confirm) prime[ptr] = j;

    }
   


    for(int i = 0; i < ptr ; i++){
      System.out.println(prime[i]);
    }

    System.out.println("count = " + counter);

  }
}