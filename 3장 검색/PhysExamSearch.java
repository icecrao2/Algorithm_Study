package chap01;
import java.util.Comparator;

class PhysExamSearch {  

  static class PhyscData {
    private String name;
    private int height;
    private double vision;

    public PhyscData(String name, int height, double vision){
      this.name = name;
      this.height = height;
      this.vision = vision;
    }
    
    public String toString(){
      return name + " " + height +" " + vision;
    }

    private static class HeightOrderComparator implements Comparator<PhyscData> {
      public int compare(PhyscData d1, PhyscData d2){
        return (d1.height > d2.height) ? 1 :
               (d1.height < d2.height) ? -1 : 0;
      }

    }

    public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
  }




}