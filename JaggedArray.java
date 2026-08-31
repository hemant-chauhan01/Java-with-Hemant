import java.util.Arrays;

public class JaggedArray {
    // private static void display(int arr[]){
    //     System.out.println("Array element : ");
    //     for(int eachelement : arr){
    //         System.out.print(eachelement + " ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     int arr1[] = {39,55,70,98,32,30,60,72,80};
    //     int arr2[] = {39,55,70,98,32,30,65,76,89};

    //     int arr3[] = Arrays.copyOfRange(arr1 , 0 , arr1.length);
    //     display(arr3);
    //     arr3 = Arrays.copyOfRange(arr1 , 4 , arr1.length);
    //     display(arr3);

    //     System.out.println("===========");
    //     System.out.println("compare arr1 and arr2");

    //     if(Arrays.compare(arr1 , arr2) == 0){
    //         System.out.println("same array");
    //     } else{
    //         System.out.println("not same");
    //     }



    //     // Arrays.mismatch(arr1,arr2)
    //     System.out.println("======Array mismatch==========");
    //     display(arr1);
    //     display(arr2);
    //     int indexOfMisMatch = Arrays.mismatch(arr1,arr2);
    //     System.out.println(indexOfMisMatch + " ");



    //     //Array.toString(null)

    //     System.out.println("========Array String============ ");
    //     String arrStr = Arrays.toString(arr3);
    //     System.out.print(arrStr + " ");
    //     System.out.println();


    //     int ion = Arrays.mismatch(arr1 , 0 , 5 , arr2 , 1 ,6);
    //     System.out.print("mismatched at  : " + ion + " ");

    // }




    private static void display(int arr[][]){
        System.out.println("Array Element : ");
        for( int[] eachRow : arr){
            for(int eachelement : eachRow){
                 System.out.print(eachelement + " ");
             }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int [4][];

        // arr[0] = new int [6];
        // arr[1] = new int [2];
        // arr[3] = new int [5];
        // arr[4] = new int [3];

        for(int row = 0; row < arr.length ; row++){
            arr[row] = new int[(row+1)];
            Arrays.fill(arr[row] , (row+1));
        }

        display(arr);
    }
}
