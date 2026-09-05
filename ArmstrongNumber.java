import java.util.*;
public class ArmstrongNumber {
    public static String display(int n){
        int temp = n;
        int digit;
        int sum = 0;
        while(n > 0){
            digit = n%10;
            sum += (int)Math.pow(digit,3);
            n/=10;
        }
        if(temp == sum){
            return "yes it's Armstrong number : " + temp ;
        } else{
            return "it's not  Armstrong number : " + temp ; 
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        System.out.println(display(n));
        sc.close();
    }
}
