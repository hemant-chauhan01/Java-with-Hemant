import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
    
        //1. Insertion Method(add the element of list)
        list.add("Hemant");
        list.add("Kuldeep");
        list.add("Ayush");
        list.add("Harsh");
        list.add("kuldeep");   // duplicate are allowed
        list.addLast("Nobi");
        list.addFirst("Sizuka");
        System.out.println("uses of add() , firstadd() , lastadd()");
        System.out.println(list);
   

        //2. Traversal Method
        Iterator<String> it1 = list.iterator();
        System.out.println("Using Iterator()");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        Iterator<String> it2 = list.descendingIterator();
        System.out.println("\nusing Decresing");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        Iterator<String> it3 = list.listIterator(5);    //index 2 on going to the last element
        System.out.println("\nusing List Iterator");
        while(it3.hasNext()){
            System.out.println(it3.next());
        }
        System.out.println("\nfor-each loop");
        for(String name : list){
             System.out.println(name);
        }

        




    }
}
