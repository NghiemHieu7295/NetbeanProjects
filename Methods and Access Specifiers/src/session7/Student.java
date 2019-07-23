package session7;

public class Student {
    int rollNo;
    String name;
    String address;
    float marks;
    
    /**
     * No-arguments constructor
     */
    public Student(){
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;
    }
    
    /**
     * Overloaded constructor
     * 
     * @param rNo an integer variable storing the roll number
     * @param sName a string variable storing the student name
     */
    public Student(int rNo, String sName){
        rollNo = rNo;
        name = sName;
    }
    
    /**
     * Overloaded constructor
     * 
     * @param rNo an integer variable storing the roll number
     * @param score a float variable storing the score
     */
    public Student(int rNo, float score){
        rollNo = rNo;
        marks = score;
    }
    
    /**
     * Overloaded constructor
     * 
     * @param sname a string variable storing student name
     * @param addr a string variable storing the address
     */
    public Student(String sname, String addr){
        name = sname;
        address = addr;
    }
    
    /**
     * Overloaded constructor
     * 
     * @param rNo an integer variable storing roll number
     * @param sname a string variable storing student name
     * @param score a float variable storing score
     */
    public Student(int rNo, String sname, float score){
        rollNo = rNo;
        name = sname;
        marks = score;
    }
    
    /**
     * Displays student details
     */
    public void displayDetails(){
        System.out.println("Roll no: " + rollNo);
        System.out.println("Student name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Score: " + marks);
        System.out.println("--------------------");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("David", "302, Washington Street");
        student1.displayDetails();
        
        Student student2 = new Student(103, 46);
        student2.displayDetails();
        
        Student student3 = new Student(104, "Roger", 50);
        student3.displayDetails();
    }
    
}
