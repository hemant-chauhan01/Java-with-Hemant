// class SuperClass1{
//     double calculate(int a){
//         return Math.pow(10,a);
//     }
// }
// class SuperClass2{
//     double calculate(int a){
//         return Math.abs(a);
//     }
// }
// class SubClass extends SuperClass1 , SuperClass2{

// }
/**
 * InnerInheritanceDemo2
 */

interface first{
    public abstract double calculate(int a);
}
interface second{
    double calculate(int a);
}
class SubClass implements first , second{
    public double calculate(int a){
        return Math.pow(10,a);
    }
}

public class InheritanceDemo2{
    public static void main(String[] args){
        SubClass sb1 = new SubClass();
        System.out.println("Result = " +sb1.calculate(3));
        
    }
}