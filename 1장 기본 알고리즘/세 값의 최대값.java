package chap01;
import java.util.Scanner;

class Max3m {

  public static int max3(int a, int b ,int c) {

    int max = a;
    if(b > max) max = b;
    if(c > max) max = c;

    return max;  
  }
}