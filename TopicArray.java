import java.util.*;
public class TopicArray {
    // public static void display(int arr[]) {
    //     System.out.println("Array element are : ");
    //     for(int index = 0; index < arr.length ; index++){
    //         System.out.println(arr[index]);
    //     }
    // }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
    //     int source[] = new int[] {10,20,30,40,50};
    //     int dest[] = new int[source.length];

    //     display(dest);

    //     for(int i = 0 ; i < source.length ; i++){
    //         dest[i] = source[i];
    //     }
    //     display(dest);
        
    
    // System.arraycopy(source ,0, dest ,0, source.length);

    System.out.println("enter size of array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("enter " + size + "elements");
    for(int index = 0; index < size ; index++){
        arr[index] = sc.nextInt();
    }
    System.out.println(arr);

    sc.close();
    }
    
}

