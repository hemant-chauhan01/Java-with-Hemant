import java.util.Scanner;

public class StringReverse {
    static String reverse(String n) {
        char ar[] = n.toCharArray();
        int s = 0, e = ar.length - 1;

        while (s < e) {
            char temp = ar[s];
            ar[s] = ar[e];
            ar[e] = temp;

            s++;
            e--;
        }

        return new String(ar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String n = sc.nextLine();

        System.out.println("Reversed string: " + reverse(n));
        sc.close();
    }
}
