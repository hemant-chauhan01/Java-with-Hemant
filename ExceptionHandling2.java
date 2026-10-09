import java.util.*;

public class ExceptionHandling2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a even number");
    int n = sc.nextInt();
    try{
      if(n%2==1)
      throw new ArithmeticException("Odd number");
      int fact = 1;
      for(int i = 1; i<=n;i++){
        fact*=i;
      System.out.println("Factorial = " +fact);
      }
    }
      catch(ArithmeticException ob){
        System.out.println(ob.toString() +"you entered odd number");
      }
      finally{
        sc.close();
      }
    
  }
}