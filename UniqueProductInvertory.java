import java.util.*;

public class UniqueProductInvertory {
    public static void main(String[] args) {
        LinkedHashSet<String> product = new LinkedHashSet<>();

        //1. Add 10 product names using add() 
        product.add("Laptop");
        product.add("Keyboard");
        product.add("Mouse");
        product.add("CPU");
        product.add("WiFi");
        product.add("Touchpad");
        product.add("Printer");
        product.add("Pen");
        product.add("Pencil");
        product.add("Rubber");
        System.out.println(product);

        //2. Insert duplicate product names and observe how duplicates are handled. 

        System.out.println("\nLinkedHashSet -> duplicates are not allowed");
        product.add("WiFi");
        product.add("CPU");
        product.add("Keyboard");
        System.out.println(product);


        LinkedHashSet<String> newProducts = new LinkedHashSet<>();
        newProducts.add("Tablet");
        newProducts.add("Phone");  
        newProducts.add("Watch");

        
        product.addAll(newProducts);

        System.out.println(product);
        

    }
}
