import java.util.Scanner;

public class PasswordCheck {
    static Boolean pswdcheck(String psw){
        if(psw.length() < 8){
            return  false;
        }
        boolean upper = false , lower = false , digit = false , special = false;
        for(char c : psw.toCharArray()){
            if(c  >= 'A' && c <= 'Z')
                upper = true;
            else if(c  >= 'a' && c <= 'z')
                lower = true;
            else if( c >= '0' && c <= '9')
                digit = true;
            else if(c!= ' ')
                special = true;
        }
        return upper && lower && digit && special ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password : ");
        String psw = sc.nextLine();

        System.out.println(pswdcheck(psw)? "Strong " : "not strong");
        sc.close();
    }
}
