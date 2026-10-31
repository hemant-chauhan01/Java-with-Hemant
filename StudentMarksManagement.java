import java.util.*;
public class StudentMarksManagement {
    public static void main(String[] args){
        HashMap<Integer,Integer> marks = new HashMap<>();
        
        //1. Insert at least 10 student records using put(). 
        marks.put(101, 95);
        marks.put(102, 91);
        marks.put(103, 88);
        marks.put(104, 76);
        marks.put(105, 35);
        marks.put(106, 67);
        marks.put(107, 56);
        marks.put(108, 89);
        marks.put(109, 98);
        marks.put(110, 96);
        System.out.println("Intial Record : " + marks);

        //2. Insert a duplicate roll number with a different marks value and observe the result
        marks.put(107, 66);
        marks.put(108, 79);

        System.out.println("Intial Record with duplicates : " + marks);

        //Add multiple student records using putAll().
        HashMap<Integer,Integer> StudentMarks = new HashMap<>();
        StudentMarks.put(121 , 78);
        StudentMarks.put(122 , 70);
        StudentMarks.put(123 , 85);
        marks.putAll(StudentMarks);
        System.out.println("\nAfter PutAll()");
        System.out.println("All Student marks with their Roll number : " + marks);


        //. Retrieve marks using get() == always return null values
        Integer marks102 = marks.get(102);
        System.out.println("\nMarks for roll number 102: " + marks102);

        //Retrieve marks for a non-existing roll number using getOrDefault().
        int defaultMarks = marks.getOrDefault(999,0); 
        System.out.println("\nMarks for roll number 999 (default): " + defaultMarks);

        //Check whether a particular roll number exists or not using containsKey().
        System.out.println("\nDoes roll number 105 exist? " + marks.containsKey(105));
        System.out.println("Does roll number 200 exist? " + marks.containsKey(200));

        //Check whether a particular marks value exists or not using containsValue().
        System.out.println("\nDo marks 95 exist? " + marks.containsValue(95));
        System.out.println("Do marks 40 exist? " + marks.containsValue(40));

        System.out.println("\nAll Student marks with their Roll number : " + marks);

        //Update marks using put()
        marks.put(105,99);
        System.out.println("\nUpdate the marks marks.put(105,99) : " + marks);

        //Update marks using replace()
        marks.replace(108,80);
        System.out.println("\nReplace the marks with replace(108 , 79) --> replace(108 , 80) : " +  marks.replace(108,80));

        //Replace marks only when the existing marks match a specified value using replace(key, oldValue, newValue)
        marks.replace(101 , 95 , 91);
        System.out.println("\nReplace the marks oldvalue to newvalue with rollnumber :  " + marks);

        //Remove a student record using remove().
        System.out.println("\nRemove record from using remove() :  " + marks.remove(101));
        System.out.println("\nRemove the record (101,91) :  " + marks);

        //Remove a student record only if its key-value pair matches using remove(key, value).
        boolean key1 = marks.remove(104, 76);
        boolean key2 = marks.remove(102 , 92);
        System.out.println(key1);
        System.out.println(key2);
        System.out.println(marks);

        

    }
}
