package chap01;
import java.util.Scanner;

class DayOfYear {  
  
  static int[][] mdays = {  //평년과 윤년의 달의 일수
    {31,28,31,30,31,30,31,31,30,31,30,31},
    {31,29,31,30,31,30,31,31,30,31,30,31}
  };

  static int isLeap(int year){  //윤년인지 판단한다.
    return (year%4 == 0 && year%100!=0 || year%400==0) ? 1 : 0;
  }

  public static int dayOfYear(int y, int m, int d){ //올해동안 몇일이 경과했는지 계산한다.
    int days = d;
    int is_leap = isLeap(y);

    for(int i = 0; i < (m-1); i++){ 
      days = days + mdays[is_leap];   //윤년이면 윤달로 계산, 평년이면 평달로계산
    }    

    return days;
  }
}