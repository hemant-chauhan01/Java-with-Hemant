class Employee{
  int eId;
  String Name;
  String Dept;
  String Des;
  int Salary;
  //constructor 
  Employee(int eId,
  String Name,
  String Dept,
  String Des,
  int Salary){
    this.eId = eId;
    this.Name = Name;
    this.Dept = Dept;
    this.Des = Des;
    this.Salary = Salary;
  }
  void getInfo(){
    System.out.println("Emp id : " + eId + 
    ", Emp Name : " + Name + 
    ", Department : " + Dept + 
    ", Designation : " + Des + 
    ", Salary : " + Salary);
  }
}
public class EmployeeInfo{
  public static void main(String[] args){
    Employee[] employee = {
      new Employee(1001, "Ashish", "Engg", "R&D", 20000),
      new Employee(1002, "Sushma", "consultant", "PM", 30000),
      new Employee(1003, "Rahul", "Clerk", "Acct", 10000),
      new Employee(1004, "Chahat", "Receptionist", "Front Desk", 12000),
      new Employee(1005, "Ranjan" , "Manager", "Engg", 50000),
      new Employee(1006, "Suman", "Engg", "Manufacturing", 23000),
      new Employee(1007, "Tanmay", "Consultant", "PM", 29000)
    };
    // employee[0].getInfo();
    // employee[1].getInfo();
    // employee[2].getInfo();
    if(args.length == 0){
        System.out.println("Please provide as a one argument :");
        return ;
    }
    int eId = Integer.parseInt(args[0]);
    boolean found  = false;
    for(Employee emp : employee){
        if(emp.eId == eId){
            emp.getInfo();
            found = true;
            break;
        }
    }
    if(!found){
        System.out.println("There is no employee of this eID : " + eId);
    }
  }
}
