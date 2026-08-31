import java.util.*;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int JAN = 1;
        final int FEB = 2;
        final int MAR = 3;
        System.out.print("enter the month number : ");
        int key = sc.nextInt();
        switch (key) {
            case 12:
            case JAN:
            case FEB:
                System.out.println("Witner");
                break;
            case MAR:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("inalid month");
                break;
        }
        sc.close();
    }
}
