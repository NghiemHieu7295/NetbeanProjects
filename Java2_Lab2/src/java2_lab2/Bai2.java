package java2_lab2;

public class Bai2 {

    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.toString());
        
        std1.setStudentID("S001");
        std1.setStudentName("Nghiem Manh Hieu");
        std1.setStudentMark(7.8);
        std1.setStudentGrade();
        System.out.println(std1.toString());
        
        Student std2 = new Student("S002", "Nghiem Manh Tuan", 8.3, "Giỏi");
        System.out.println(std2.toString());
        
        Student std3 = new Student();
        std3.input();
        std3.setStudentGrade();
        System.out.println(std3.toString());
    }   
}