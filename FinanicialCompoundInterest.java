import java.util.*;

public class FinanicialCompoundInterest {
    public static void FCI(double Principal , double Rate , int Years){
    double monthlyrate ;
    monthlyrate = Rate/(12*100);   // define monthly rate
    double balance = Principal; 
    int totalInterest = 0;
    int totalmonth = 12 * Years;
    for(int month = 1; month <= totalmonth; month++){
      double interest = balance * monthlyrate;   //define interest
      balance += interest ;    // total balance for the month
      totalInterest += interest;   //total interest for the month
      System.out.printf("Months : %d Interest : %.2f Balance : %.2f%n", month, interest, balance);
    }
    System.out.print("Total Interest Earned: "+ totalInterest);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter Principal : ");
    double Principal = sc.nextDouble();
    System.out.print("enter Rate : ");
    double Rate = sc.nextDouble();
    System.out.print("enter Years : ");
    int Years = sc.nextInt();
    FCI(Principal,Rate,Years);
    sc.close();
  }
}
