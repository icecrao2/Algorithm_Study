package chap01;
import java.util.Scanner;

class CardConvRev {  
  
  public static int cardConvR(int x, int r, char[] d){
    int digit = 0;
    String dchar = "0123456789abcdefghijklmnopqrstuvwxyz";

    do {
      d[digit++] = dchar.charAt(x % r);
      x /= r;
    }while(x != 0)

    return digit;
  }
}