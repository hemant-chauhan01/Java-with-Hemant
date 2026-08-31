//import java.util.*;
public class FIndTargetValue {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num[] = {4,7,9,1};
    //     System.out.println("enter the target values : ");
    //     int target = sc.nextInt();
        // for(int i = 0 ; i < num.length ; i++){
        //     for(int j = 0; j <= i ; j++){
        //         if(num[i]+num[j]==target){
        //             System.out.println("index of i and j is target values : " + j +","+ i);
        //             break;
        //         }
                
        //     }
        // }
    //     sc.close();

    // }
    public static String targetfind(int[] nums , int target){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0; j <= i ; j++){
                if(nums[i]+nums[j]==target){
                   return "index of i and j is target values : " + j +","+ i ;
                }
                
            }
        }
        return "wrong index";
        
    }
    public static void main(String[] args) {
        int[] nums = {4,6,8,9};
        int target = 14;
        System.out.println(targetfind(nums , target));
       
    }
}
