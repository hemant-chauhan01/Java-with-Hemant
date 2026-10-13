class CartItem {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public CartItem(int productId, String productName,
    double price, int quantity) {

        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative");

        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be greater than 0");

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateSubtotal() {
        return price * quantity;
    }

    public void updateQuantity(int newQuantity) {
        if (newQuantity <= 0)
            throw new IllegalArgumentException(
                    "Quantity must be greater than 0");

        quantity = newQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void displayItem() {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Subtotal : " + calculateSubtotal());
        System.out.println();
    }
}

class ShoppingCart {
    private CartItem arr[];
    private int index;

    public ShoppingCart(int numberOfItems) {
        arr = new CartItem[numberOfItems];
        index = -1;
    }

    public void addItems(CartItem item) {

        if (item == null)
            throw new NullPointerException(
                    "Cannot add a null item.");

        if (index == arr.length - 1) {
            System.out.println("Cart is full. Cannot add "
                    + item.getProductName());
            return;
        }

        arr[++index] = item;
    }

    public void removeItems(String name) {

        boolean found = false;

        for (int i = 0; i <= index; i++) {

            if (arr[i] != null &&
                    arr[i].getProductName().equalsIgnoreCase(name)) {

                found = true;

                for (int j = i; j < index; j++) {
                    arr[j] = arr[j + 1];
                }

                arr[index] = null;
                index--;
                break;
            }
        }

        if (!found) {
            System.out.println(name + " not found in cart.");
        }
    }

    public double totalBill() {

        double total = 0;

        for (int i = 0; i <= index; i++) {

            if (arr[i] == null)
                throw new NullPointerException(
                        "Cart item is not initialized");

            total += arr[i].calculateSubtotal();
        }

        return total;
    }

    public void displayCart() {

        if (index == -1) {
            System.out.println("Cart is empty");
            return;
        }

        for (int i = 0; i <= index; i++) {
            arr[i].displayItem();
        }

        System.out.println("Total Bill = " + totalBill());
    }

    public CartItem getItem(int position) {

        if (position < 0 || position > index)
            throw new IndexOutOfBoundsException(
                    "Invalid cart index : " + position);

        return arr[position];
    }
}

public class CartManagementSystem {

    public static void main(String[] args) {

        try {

            CartItem c1 = new CartItem(101,
                    "Laptop", 67000, 1);

            CartItem c2 = new CartItem(102,
                    "Mouse", 2000, 2);

            CartItem c3 = new CartItem(103,
                    "Keyboard", 1000, 1);

            CartItem c4 = new CartItem(104,
                    "SSD", 4000, 1);

            ShoppingCart cart = new ShoppingCart(3);

            cart.addItems(c1);
            cart.addItems(c2);
            cart.addItems(c3);

            // Cart full
            cart.addItems(c4);

            System.out.println("Initial Cart");
            cart.displayCart();

            System.out.println("\nRemoving Mouse...");
            cart.removeItems("Mouse");

            cart.displayCart();

            // IndexOutOfBoundsException
            System.out.println("\nAccessing index 5...");
            cart.getItem(5);

            // ArithmeticException Demo
            int x = 10 / 0;
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println(
                    "IndexOutOfBoundsException : "
                            + e.getMessage());
        }

        catch (NullPointerException e) {
            System.out.println(
                    "NullPointerException : "
                            + e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println(
                    "IllegalArgumentException : "
                            + e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println(
                    "ArithmeticException : "
                            + e.getMessage());
        }

        finally {
            System.out.println(
                    "\nCart operation completed.");
        }
    }
}