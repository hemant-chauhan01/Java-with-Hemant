
import java.util.*;
public class TreeSetDemo{
  public static void main(String[] args){
    Student s1 = new Student(101,"Rajiv",20);
    Student s2 = new Student(123,"Ajay",18);
    Student s3 = new Student(110,"Rohan",21);
    Student s4 = new Student(106,"Priya",22);

    TreeSet<Student> set = new TreeSet<Student>();
    //  TreeSet<Student> set = new TreeSet<Student>(
    //   Comparator.comparing(obj -> obj.getName())
    // );
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);

    set.stream()
    .forEach(obj -> System.out.print(set.toString()));

  }
}