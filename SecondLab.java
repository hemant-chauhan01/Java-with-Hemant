import java.util.*;
public class SecondLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if(a>b)
        //     System.out.println(a);
        // else
        //     System.out.println(b);
        // System.out.println(a>b?a:b);
        // if(a%2==0)
        //     System.out.println("even");
        // else
        //     System.out.println("odd");
        // if((a&1)==0)
        //     System.out.println("even");
        // else
        //     System.out.println("odd");
        // if(a>b){
        //     if(a>c){
        //         System.out.println("greater : "+ a);
        //     }
        //     else{
        //         System.out.println("greater : "+ c);
        //     }
        // }
        // else{
        //     if(b>c){
        //         System.out.println("greater : "+ b);
        //     }
        //     else{
        //         System.out.println("greater : "+ c);
        //     }
        // }
        // if(a>b && a>c)
        //     System.out.println(a);
        // else if(b>c)
        //     System.out.println(b);
        // else
        //     System.out.println(c);
        // System.out.println(a > b ? ( a > b ? a : c ) : ( b > c ? b : c));
        // System.out.println( a > b && a > c ? a : ( b > c ? b : c));
        // System.out.println( Math.max(Math.max(a,b),c) );
        // System.out.println( a+b+c - Math.max(Math.max(a,b),c) - Math.min(Math.min(a,b),c) );
        // double per = marks/500.0 * 100 ;
        // if(per>=90)
        //     System.out.println("Grade A");
        // else if(per >= 80)
        //     System.out.println("Grade B");
        // else if(per >= 60)
        //     System.out.println("Grade B");
        // else if(per >= 40)
        //     System.out.println("Grade C");
        // else
        //     System.out.println("Grade F");
        // for(int i = 0 ; i <= n ; i++){
        //     System.out.print(i+",");
        // // }
        //  for(int i = n ; i >= 1 ; i--){
        //     System.out.print(i+",");
        // }
         for(int i = 0 ; i <= n ; i++){
            System.out.print(Math.sqrt(i) +",");
        }
        sc.close();
    }
}
