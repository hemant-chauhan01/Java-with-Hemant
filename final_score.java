import java.util.Arrays;
import java.util.*;
public class final_score{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter how many Students in matrix : ");
    int row = sc.nextInt();
    System.out.print("enter how many Subjects in matrix : ");
    int col = sc.nextInt();
    int[][] mid_term = new int[row][col];            // mid term score
    int[][] end_term = new int[row][col];           // end term score
    int[][] final_result = new int[row][col];      // final result of mid and end term
    for(int i = 0 ; i < row ; i++){
      for(int j = 0 ; j < col ; j++){
        mid_term[i][j] = sc.nextInt();
      }
    }
    for(int i = 0 ; i < row ; i++){
      for(int j = 0 ; j < col ; j++){
        end_term[i][j] = sc.nextInt();
      }
    }
    for(int i = 0 ; i < row ; i++){
      for(int j = 0 ; j < col ; j++){
        final_result[i][j] = mid_term[i][j] + end_term[i][j];
      }
    }
    for(int[] arr : final_result){
      System.out.println(Arrays.toString(arr));
    }
    sc.close();
  }
}