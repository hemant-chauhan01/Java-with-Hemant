import java.security.KeyStore.Entry;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Hemant");
        map.put(2, "Harsh");
        map.put(5, "Tarun");
        map.put(2, "Ajay");

        System.out.println("Size = " + map.size());
        System.out.println(map.toString());

        System.out.println("Name of 1: " + map.get(1));
        System.out.println("Name of 2: " + map.get(5));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values:" + map.values());

        System.out.println("Key 5 ? = " + map.containsKey(6));
        System.out.println("Values Ajay ? = " + map.containsValue("Ajay"));

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("\n-----1-----");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key = " + entry.getKey());
            System.out.println("Values = " + entry.getValue());
        }

        System.out.println("\n-----2-----");
        Iterator<Map.Entry<Integer, String>> it1 = entries.iterator();
        while (it1.hasNext()) {
            Map.Entry<Integer, String> entry = it1.next();
            System.out.println("Key = " + entry.getKey());
            System.out.println("Values = " + entry.getValue());

        }



        System.out.println("\n-----3-----");
        entries.stream()
        //.filter(entry -> entry.getKey() % 2 != 0)
        .forEach(entry ->{
            System.out.println("Key = " + entry.getKey());
            System.out.println("Values = " + entry.getValue());

        });

    }

}
