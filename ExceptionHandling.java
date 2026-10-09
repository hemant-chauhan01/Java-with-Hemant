import java.util.*;

public class ExceptionHandling{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 0;
    try{
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println(a/b);
      int arr[] = {1,3,4};
      System.out.println("Enter index");
      int index = sc.nextInt();
      System.out.println(arr[index]);
    }catch(ArithmeticException ob){
      System.out.println(ob.toString() + " : you anter 2nd value is 0 please enter a another value");
      b = sc.nextInt();
      System.out.println(a/b);
    }catch(InputMismatchException ob){
      System.out.println(ob.toString() + ": You enter a wrong value");
    }catch(ArrayIndexOutOfBoundsException ob){
      System.out.println(ob.toString());
    }finally{
      sc.close();
      System.out.println("This is finally block");
    }
    System.out.println("Hello this is end of program");
  }
}