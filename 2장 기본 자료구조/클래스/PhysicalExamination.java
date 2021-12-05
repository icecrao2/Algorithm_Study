package chap01;
import java.util.Scanner;


class PhysicalExamination {  

  static final int VMAX = 21; //변하지 않는 변수(상수)

  static class PhyscData {    //내부 클래스
    String name;
    int height;
    double vision;
  
    PhyscData(String name, int height, double vision)}{ //클래스의 배열화
      this.name = name;
      this.height= height;
      this.vision = vision;
    }
  }

  static double aveHeight(PhyscData[] dat){
    double sum = 0;

    for(int i = 0 ; i < dat.length; i++){
      sum += dat[i].height;
    }

    return sum / dat.length;
  }

 
}