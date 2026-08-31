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
            return "yes it is Armstrong number : " + temp ;
        } else{
            return "no it is not  Armstrong number : " + temp ; 
        }

    }
    public static void main(String[] args){
        int n = 154;
        System.out.println(display(n));
    }
}
