import java.util.HashSet;
import java.util.*;
public class StudentRegistration {
    public static void main(String[] args){
        HashSet<Integer> Student = new HashSet<>();
        Student.add(101);
        Student.add(102);
        Student.add(103);
        Student.add(104);
        Student.add(105);
        Student.add(106);
        Student.add(107);
        Student.add(108);

        //duplicate inserted
        Student.add(104);
        Student.add(101);

        System.out.println(Student);

    }
}
