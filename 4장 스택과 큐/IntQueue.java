package chap01;
import java.util.Scanner;
import java.util.Arrays;


class IntQueue {  
  
  private int max;
  private int front;
  private int rear;
  private int num;
  private int[] que;

  public class EmptyIntQueException extends RuntimeException {
    public EmptyIntStackException() {}
  }

  public class OverflowIntQueException extends RuntimeException {
    public OverflowIntStackException() {}
  }

  public IntQueue(int capacity) {
    num = front = rear = 0;
    max = capacity;
    try{
      que = new int[max];
    } catch(OutOfMemoryError e){
      max = 0;
    }
  }

  public int enque(int x) throws OverflowIntQueException {

    if(num >= max)
      throw OverflowIntQueException();

    que[rear++] = x;
    num++;
    
    //링 버퍼 자료구조
    if(rear == max)
      rear = 0;

    return x;
  }

  public int deque() throws EmptyIntQueException {

    if(front <= 0)  throw EmptyIntQueException();
    int x = que[front++];
    num--;
    //링 버퍼 자료구조
    if(front >= max)
      front = 0;
    
    return x;

  }

}