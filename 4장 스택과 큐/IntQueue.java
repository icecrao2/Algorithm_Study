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
      throw new OverflowIntQueException();

    que[rear++] = x;
    num++;
    
    //링 버퍼 자료구조
    if(rear == max)
      rear = 0;

    return x;
  }

  public int deque() throws EmptyIntQueException {

    if(front <= 0)  throw new EmptyIntQueException();
    int x = que[front++];
    num--;
    //링 버퍼 자료구조
    if(front >= max)
      front = 0;
    
    return x;

  }

  public int peek() throws EmptyIntQueException {
    
    if(front <= 0) throw new EmptyIntQueException();

    return que[front];
  }

  public int indexOf(int x) {

    for(int i = 0 ; i < num; i++){

      int idx = (i + front) % num
      if(que[idx] == x) return idx;
    }

    return -1;

  }


  public void clear(){
    front = rear = num = 0;
  }

  public int capacity(){
    return max;
  }

  public int size(){
    return num;
  }

  public boolean isEmpty(){
    return (num <= 0) ? true : false;
  }
  public boolean isFull(){
    return (num >= max) ? true : false;
  }
  public void dump(){
    if(num <= 0)
      System.out.pritntln("큐가 비어있습니다.");

    else {
      for(int i = 0 ; i < num ; i++)
        System.out.print(que[(i+front) % max] + " ");
      System.out.println();
    } 
  }
}