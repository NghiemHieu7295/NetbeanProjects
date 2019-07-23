package java2_lab1;

public class Bai3 {

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.input();
        std1.calGrade();
        System.out.println();
        std1.display();
        System.out.println();
        
        Student std2 = new Student("14108641", "Nghiem Manh Tuan", 24, 7);
        std2.calGrade();
        std2.display();
    }
}    