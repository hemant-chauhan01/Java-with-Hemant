import java.util.*;
public class Amount{
  public static void dispenseChange(int amount){
    int count100 = amount/100;
    amount = amount%100;

    int count50 = amount / 50;
    amount = amount % 50;

    int count20 = amount / 20;
    amount = amount % 20;

    int count10 = amount / 10;
    amount = amount % 10;

    int count5 = amount / 5;
    amount = amount % 5;

    int count1 = amount / 1;
    
    System.out.println("$100 bills:  " + count100);
    System.out.println("$50 bills: " + count50);
    System.out.println("$20 bills:  " + count20);
    System.out.println("$10 bills:  " + count10);
    System.out.println("$5 bills: " + count5);
    System.out.println("$1 bills: " + count1);
  }
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Amount : ");
    int amount = sc.nextInt();
    dispenseChange(amount);
    sc.close();
  }
  
}