public class twoDArray{
    public static void display1D(int arr[]) {
        System.out.println("1D Array Elements:");
        for (int eachelement : arr) {
            System.out.print(eachelement + " ");
        }
        System.out.println();
    }

    public static void totalSale(int arr[][]) {
        System.out.println("2D Array Elements:");
        for (int[] reFVarArr : arr) {
            for (int eachelement : reFVarArr) {
                System.out.print(eachelement + " ");
            }
            System.out.println();
        }
    }
     public static int display2D(int arr[][]) {
        int totalSales = 0;
        System.out.println("2D Array Elements Total Sales:");
        for (int[] reFVarArr : arr) {
            for (int eachelement : reFVarArr) {
                totalSales += eachelement;
            }
        }
        return totalSales;
    }

    public static void main(String[] args) {
        int num[] = {45, 56, 34, 67, 34, 33};
        int arr[][] = {
            {45, 34, 56, 34},
            {45, 67, 89, 45},
            {45, 34, 567, 89},
            {42, 67, 87, 90}
        };

        display1D(num);   
        display2D(arr);  
        totalSale(arr); 
       // System.out.printf("%d",totalSale(arr));
    }
}
