import java.util.Scanner;

public class SearchProductName {
    
    public static void main(String[] args) {

        String ar[] = {
            "pen", "pencil", "paneer", "panir", "pizza",
            "pasta", "butter chicken", "butter", "bread"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product name: ");
        String name = sc.nextLine();

        for (String s : ar) {
            if (s.startsWith(name)) {
                System.out.println(s);
            }
            
        }
    

        sc.close();
    }
}
