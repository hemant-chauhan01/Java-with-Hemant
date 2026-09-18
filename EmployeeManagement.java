class Employee{
  int id;
  String name;
  String dept;
  Employee(int id , String name , String dept){
    this.id = id;
    this.name = name;
    this.dept = dept;
  }
  void displayinfo(){
    System.out.println("======================================");
    System.out.println("employee id : " + id);
    System.out.println("employee name : " + name);
    System.out.println("employee department : " + dept);
  }
}
class Faculty extends Employee{
  String subject ;
  String designation;
  int exp; 
  Faculty(String s ,
  String d,
  int ex , int id , String name , String dept){
    super(id , name , dept);
    subject = s;
    designation = d;
    exp = ex;
  }
  void displayFacultyinfo(){
    System.out.println("======================================");
    System.out.println("Subject  : " + subject);
    System.out.println("designation : " + designation);
    System.out.println("experience : " + exp);
  }
}
public class EmployeeManagement{
  public static void main(String[] args){
    Faculty f = new Faculty("OOPs" , "Assistant Professor" , 5 , 1111 , "Amit Singh" , "CEA");
    f.displayinfo();
    f.displayFacultyinfo();
  }
}