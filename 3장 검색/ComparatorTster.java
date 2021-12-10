package chap01;
import java.util.Comparator;



//해당 클래스에서 이 비교형식을 사용하고 싶으면 ComparatorTester.COMPARATOR를 호출하면 됨
//이런식으로 비교를 위한 클래스들을 한 클래스내에 숨겨놓을 수 있음
class ComparatorTester {  
  
  
  public static final Comparator<T> COMPARATOR = new Comp();

  
  private static class Comp implements Comparator<T> {

    public int compare(T t1, T t2){
      if(t1 > t2) return 1;
      else if(t1 < t2) return -1;
      else return 0;
    }

  }

}