import java.util.* ;
public class StartLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : "); 
        int times = sc.nextInt();
        // for(int i = 0 ; i <= times ; i++){
        //     System.out.print(i+ " ");
        // }
        System.out.println("======1======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j <= times ; j++){
               // System.out.printf("%2s" ,"*");
               System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======2======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j <= i ; j++){
               // System.out.printf("%2s" ,"*");
               System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======3======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = i ; j <= times ; j++){
               // System.out.printf("%2s" ,"*");
               System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======4======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j < i ; j++){
               // System.out.printf("%2s" ,"*");
               System.out.print(" ");   //two blankspaces
            }
            for(int k = times ; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======5======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = times ; j > i ; j--){
               // System.out.printf("%2s" ,"*");
               System.out.print(" ");   //two blankspaces
            }
            for(int k = 1 ; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======6======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j <= i ; j++){
               // System.out.printf("%2s" ,"*");
               System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("======7======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j <= i ; j++){
               // System.out.printf("%2s" ,"*");
               System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("======8======");
        int counter = 1;
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j <= i ; j++){
               // System.out.printf("%2s" ,"*");
               System.out.printf("%3d",counter++);
            }
            System.out.println();
        }
        System.out.println("======9======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j <= times ; j++){
                if(i == 1 || i == times || j == 1 || j == times)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("======10======");
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j <= times ; j++){
                if(i == 1 || i == times || j == 1 || j == times || i == j)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("======11======");
        for(int i = 1 ; i <= times/2 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int k = times/2-1 ; k >= i ; k--){
                System.out.print("    ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2 ; i <= times/2 ; i++){
            for(int j = times/2 ; j >= i ; j--){
                System.out.print("*");
            }
            for(int k = 1 ; k < i ; k++){
                System.out.print("    ");
            }
            for(int j = times/2 ; j >= i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

         

        System.out.println("======12======");
        int count = 1;
        for(int i = 1 ; i <= times ; i++){
            for(int j = 1 ; j <= i ; j++){
                if((count & 1) == 0)
                    System.out.print(0);
                else
                    System.out.print(1);
                count++;
            }
            System.out.println();
        }

        sc.close();


    }
}

