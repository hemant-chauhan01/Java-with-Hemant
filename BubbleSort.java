import java.util.*;
import java.util.Arrays;
public class BubbleSort{
  public static void bubbleSort(int[] arr){
    boolean swapped = false;
    for(int i = 0; i < arr.length - 1 ; i++){
      for(int j = 0 ; j < arr.length - i - 1 ; j++){
        if(arr[j] > arr[j+1]){
          int mid = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = mid;
          swapped = true;
        }
      }if(!(swapped)) break;
    }
  }
  public static void main(String[] args){
    int[] arr = {5,6,3,1};
    bubbleSort(arr);
    System.out.println("BubbleSort : " + Arrays.toString(arr));
  }
}