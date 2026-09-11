import java.util.*;
public class Feedback {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int space = 0 , vowels = 0 , con = 0;
    String feedback = sc.nextLine().toLowerCase();
    for(char c  : feedback.toCharArray()){
      if(c==' ') space++;
      if(c >= 'a' && c <='z'){
        if(c == 'a' ||c == 'e'||c == 'i'||c == 'o'||c == 'u' ){
          vowels++;
        }else{
          con++;
        }
      }
    }
    System.out.println("Total Word = " + (space+1));
    System.out.println("Total Character = " + feedback.length());
    System.out.println("Total vowels = " + vowels);
    System.out.println("Total Constants = " + con);
    sc.close();
  }
}

