import java.util.*;

class ValidAge extends Exception{
  ValidAge(String message){
    super(message);
  }
}
public class CreateOwnException{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a voter age : ");
    int age = sc.nextInt();
    try{
      if(age<18){
        throw new ValidAge("Invalid voter age");
      }

      System.out.println("valid age");
    }catch(ValidAge ob){
      System.out.println(ob.toString());

    }
    sc.close();
  }
}