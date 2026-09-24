@FunctionalInterface
interface Operations{
  int compute(int num1 , int num2);
}
// class Calculator implements Operations{
//   public int compute(int num1 , int num2){
//     return num1+num2;
//   }
// }
// class PowCalc implements Operations{
//   public int compute(int num1 , int num2){
//     return (int)Math.pow(num1,num2);
//   }
// }
public class DemoInterface1{
  public static void main(String[] args){
    // Calculator obj1 = new Calculator();
    // System.out.println("Result = " + obj1.compute(10,20));

    // PowCalc obj2 = new PowCalc();
    // System.out.println("Result = " + obj2.compute(10,2));


    // Operations obj3 = new Operations(){
    //   @Override
    //   public int compute(int num1 , int num2){
    //     return num1 * num2;
    //   }
    // };
    // System.out.println("Result = " + obj3.compute(20,25));

    Operations obj1 = (a,b) -> a+b;
    Operations obj2 = (a,b) -> (int)Math.pow(a,b);
    Operations obj3 = (a,b) -> a-b;
    Operations obj4 = (a,b) -> a*b;
    Operations obj5 = (a,b) -> a%b;
    
    System.out.println(obj1.compute(10 , 20));
    System.out.println(obj2.compute(100 , 3));
    System.out.println(obj3.compute(10 , 20));
    System.out.println(obj4.compute(10 , 20));
    System.out.println(obj5.compute(10 , 20));

   




  }
}