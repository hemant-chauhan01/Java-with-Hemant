import java.util.*;
class Product{
    String name;
    int price;
    public Product(String name , int price){
        super(); //object class of constructor 
        this.name = name;
        this.price = price;
    }
}
public class ProductStore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfOperations = sc.nextInt();

        Product parr[] = new Product[noOfOperations];
        int productIndex = -1;
        for(int index = 0 ; index < noOfOperations ; index++){
            String opstr = sc.nextLine();   //Add laptop 50000
            String parts[] = opstr.split("[ ]");
            String operation = parts[0];
            switch (operation) {
                case "ADD":
                    boolean isExist = false;
                    break;
                case "ADD":
                    boolean isExist = false;
                    break;
            
                default:
                    break;
            }
        }
    }
}