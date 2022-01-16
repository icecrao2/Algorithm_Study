package chap01;
import java.util.Scanner;

class Boyer_Moore {  
  

  static int bmMatch(String txt, String pat){

    int pt;
    int index;
    int txtlen = txt.length();
    int patlen = pat.length();
    boolean trigger = false;


    pt = patlen;
    index = patlen;

    while(true){

      for(int i = patlen-1 ; i >= 0 ; i--){

        if(pat.charAt(i) == txt.charAt(pt) && i == patlen - 1){
          pt--;
          trigger = true;
        }

        else if(pat.charAt(i) == txt.charAt(pt)){
          
          if(trigger == true){
            pt--;
          }
          else
            pt = pt + patlen - i - 1;
        }

        else trigger = false;
      }

      if(trigger == true) return pt;

    }


  }
}