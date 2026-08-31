public class SelectionSort {
    public static void display(int arr[]){
        System.out.println("before the sorting array");
        for(int index = 0 ; index < arr.length ; index++){
            System.out.printf("%d " , arr[index]);
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]){
        int mid = -1;
        for(int i = 0; i<arr.length-1; i++){
            mid  = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[mid]){
                    mid  = j;
                }
            }
            int ele = arr[i];
            arr[i] = arr[mid];
            arr[mid] = ele;
            display(arr);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        display(arr);
        selectionSort(arr);
        display(arr);
        
    }
}
