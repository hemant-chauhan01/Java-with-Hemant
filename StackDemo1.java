class Stack{
  int arr[];
  int tos;

  Stack(int size){
    arr = new int[size];
    tos = -1;
  }
  void push(int element){
    if(tos >= arr.length - 1){
        System.out.println("Stack overflow");
    }else{
        tos++;
        arr[tos] = element;
    }
  }
  int pop(){
    int element = -1;
    if(tos <= -1){
      System.out.println("Stack underflow");
    }else{
      element = arr[tos];
      tos--;
    }
    return element;
  }
  int peek(){
    int element = -1;
    if(tos <= -1){
      System.out.println("Stack underflow");
    }else{
      element = arr[tos];
    }
    return element;
  }
  boolean isEmpty(){
    if(tos <= -1){
        return true;
    }
    return false;
  }
  void displayStack(){
    System.out.println("Stack Element : ");
    for(int index = 0 ; index <= tos; index++){
        System.out.print(arr[index] + " ");
    }
    System.out.println();
  }
}
public class StackDemo1{
  public static void main(String[] args){
  Stack s1 = new Stack(10);
  System.out.println("empty ? = " +s1.isEmpty());

  for(int i = 35 ; i <= 45 ; i++){
    s1.push(i);
  }
  s1.displayStack();
  s1.push(55);
  }
}


