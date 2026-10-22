import java.util.*;

public class ListDemo2{
  public static void main(String[] args){
    ArrayList<String> name = null;
    name = new ArrayList<String>();
    name.add("Ayush");
    name.add("Nihkil");
    name.add("Adi");
    name.add("Harsh");
    name.add("Ayush1");
    name.add(2,"Ayush2");
    System.out.println("--1.Retrieve names--");
    for(int i = 0; i < name.size(); i++){
      System.out.println(name.get(i));
    }
    
    System.out.println("--2.Retrieve names--");
    for(String names : name){
      System.out.println(names);
    }
    System.out.println("--3, retrieve names--");
    Iterator it1 = name.iterator();
    while(it1.hasNext()){
      System.out.println(it1.next());
    }
    // System.out.println(names.toString());
    System.out.println("--4. Retrieve Names--");
    name.stream()
    .filter(names -> names.startsWith("N"))
    .forEach(names -> System.out.println(names));

    
  }
}