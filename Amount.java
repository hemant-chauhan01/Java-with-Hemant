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
    
    System.out.println("Number of 100 rupees are : " + count100);
    System.out.println("Number of 50 rupees are : " + count50);
    System.out.println("Number of 20 rupees are : " + count20);
    System.out.println("Number of 10 rupees are : " + count10);
    System.out.println("Number of 5 rupees are : " + count5);
    System.out.println("Number of 1 rupees are : " + count1);
  }
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Amount : ");
    int amount = sc.nextInt();
    dispenseChange(amount);
    sc.close();
  }
  
}