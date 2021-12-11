package chap01;
import java.util.Scanner;
import java.util.Arrays;


class IntStack {  
  
  private int max;
  private int ptr;
  private int[] stk;

  public class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() {}
  }

  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() {}
  }
  
  public int IntStack(int capacity){
    max = capacity;
    ptr = 0;
    
    try{
      stk = new int[max]
    }catch(OutOfMemoryError e){
      max = 0;
    }
  }


  public int push(int x) throws OverflowIntStackException {
    
    if(ptr >= max){
      throw new OverflowIntStackException();
    }
    return stk[ptr++] = x;

  }

  public int pop() throws EmptyIntStackException {
    if(ptr <= 0)
      throw new EmptyIntStackException();
    return stk[--ptr];
  }

  public int peek() throws EmptyIntStackException {
    if(ptr <= 0)
      throw new EmptyIntStackException();
    return stk[ptr - 1];
  }

  public int indexOf(int x) {
    for(int i = max ; i >= 0; i--){
      if(stk[i] == x) return i;
    }
    return -1;
  }
  
  //스택을 비움
  public void clear() {
    ptr = 0;
  }

  public int capacity(){
    return max;
  }

  public int size(){
    return ptr;
  }

  public boolean isEmpty(){
    return (ptr <= 0)? true : false ;
  }
  public boolean isFull(){
    return (ptr >= max) ? true : false;
  }

  public void dump(){
    
    if(ptr <= 0) System.out.println("스택이 비어 있습니다.");
    
    else {
      for(int i = 0 ; i < ptr ; i++){
        System.out.print(stk[i] + " ");
      }
      System.out.println();
    }
  }
}