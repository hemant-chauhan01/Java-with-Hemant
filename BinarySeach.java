import java.util.*;
public class BinarySeach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {23,34,45,46,47,56,67,78,79,89,90,92,95,97}; // only sorted array
        System.out.print("emter the target value : ");
        int mid = -1;
        int target = sc.nextInt();
        int left = 0;
        int right = arr.length;
        while(left <= right){
            mid = (left+right)/2;
            if(target == arr[mid]){
                System.out.println(arr[mid] + " this number at is index : "+ mid );
                break;
            }
            else if(target < arr[mid]){
                right = mid - 1;
            }
            else if(target > arr[mid]){
                left = mid + 1;
            }
        }
        sc.close();

    }
}
