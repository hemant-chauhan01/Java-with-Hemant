class Student {
    int rollNUmber;
    String studentName;
    double[] marks;
    int numberOfSubjects;

    // create a constructor
    public  Student(int rollNUmber,
    String studentName,
    int numberOfSubjects){
        this.rollNUmber = rollNUmber;
        this.studentName = studentName;
        this.numberOfSubjects = numberOfSubjects;
        this.marks = new double[numberOfSubjects];
    }
    // void displayStudentdetail(){
    //     System.out.println("Roll number : " + rollNUmber);
    //     System.out.println("Student Name : " + studentName);
    //     System.err.println("Marks : " + marks);
    //     System.out.println("Number of Subjects  :" + numberOfSubjects);
    // }
    public void addMarks(int subjectIndex, double marks){
        try{
            if(marks < 0 || marks > 100){
                throw new IllegalArgumentException("Marks b/w 1 to 100");
            }this.marks[subjectIndex] = marks;
        }catch(IndexOutOfBoundsException ob){
            System.out.println("Invalid Subject Marks : " + ob.getMessage());
        }catch(IllegalArgumentException ob){
            System.out.println("Error : " + ob.getMessage());
        }
    }
    public double calculateAverage(){

        double sum = 0;
        try{
            if(numberOfSubjects == 0){
                throw new ArithmeticException("No Subject ");
            }else if(marks.length>0){
                for(int i = 0; i < marks.length ; i++){
                    sum += marks[i];
                }
            }
            return sum/marks.length;
        }catch(ArithmeticException ob){
            System.out.println("Error :" + ob.getMessage());
            return 0;
        }
    }
     public void displayResult(){
        System.out.println("Roll number : " + rollNUmber);
        System.out.println("Student Name : " + studentName);
        System.out.println("Marks : ");
        for(double mark : marks){
            System.out.println(mark + " ");
        }
        double avg = calculateAverage();
        System.out.println("Average of all the subject  :" + avg);
        System.err.println("Result : " + (avg >= 40 ? "pass" : "fail"));
        
    }
}

public class StudentDetails{
    public static void main(String[] args){
        Student s1 = new Student(101,"Kuldeep" , 3);
        try {
            // Valid marks
            s1.addMarks(0, 78.5);
            s1.addMarks(1, 85.0);

            // Invalid index out of range 
            s1.addMarks(5, 90.0);

            // Invalid marks → illegal exeption throw
            s1.addMarks(2, 120.0);

            // String format input  
            String input = "abc"; // teacher entered text instead of number
            double mark = Double.parseDouble(input); // throws NumberFormatException
            s1.addMarks(2, mark);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format → " + e.getMessage());
        } finally {
            System.out.println("Result processing completed.");
        }

        // Display final result
        s1.displayResult();
    }
}

