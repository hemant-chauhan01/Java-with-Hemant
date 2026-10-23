import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
public class ListDemo3 {

    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(75);
        marks.add(89);
        marks.add(95);
        marks.add(98);
        marks.add(81);
        marks.add(88);
        marks.add(79);

        System.out.println("No. of Subjects : " +marks.size());
        System.out.println("Max. Marks : " + Collections.max(marks));
        System.out.println("Min. Marks : " + Collections.min(marks));

        Collections.sort(marks);
        System.out.println("After Sorting");
        System.out.println(marks);

        int searchfor = 98;
        int index = Collections.binarySearch(marks , searchfor);
        System.out.println(searchfor + " found at index = " + index);

        
    }







}
