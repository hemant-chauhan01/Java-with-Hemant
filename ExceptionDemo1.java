public class ExceptionDemo1{
  static void calculation(int a , int b){
    try{
    System.out.println("Calculation Method " + a + " and " + b);
    int result = a/b;
    System.out.println("Result : " + result);

    int[] arr = new int[]{34,45,6,45,67,78,23,45,56};
    System.out.println(arr[a+b]);


    }catch(ArithmeticException ob){
      System.out.println(ob.getMessage());
    }catch(ArrayIndexOutOfBoundsException ob){
      System.out.println(ob.getMessage());
    }finally{
      System.out.println("this as finally Block");
    }
  }
  public static void main(String[] args){
    calculation(2,1);
    calculation(4,0);
    calculation(20,2);
    
    System.out.println("Last Statement");
  }
}