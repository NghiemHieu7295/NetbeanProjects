package java2_lab1;

import java.util.Scanner;

public class Student extends Person{
    private int mark;
    private String grade;
    
    public Student(){
        super();
        this.mark = 0;
        this.grade = null;
    }
    
    public Student(String id, String name, int age, int mark){
        super(id, name, age);
        this.mark = mark;
    }
    
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
   
    public String getGrade() {
        return grade;
    }
    
    public void calGrade(){
        if(this.mark >= 8){
            this.grade = "Distinction";
        }
        else if(this.mark >= 7){
            this.grade = "Credit";
        }
        else if(this.mark >= 5){
            this.grade = "Pass";
        }
        else{
            this.grade = "Fail";
        }
    }
    
    @Override
    public void input(){
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập mã sinh viên: ");
        String studentId = nhap.nextLine();
        System.out.print("Nhập họ tên: ");
        String studentName = nhap.nextLine();
        System.out.print("Nhập tuổi: ");
        int studentAge = nhap.nextInt();
        System.out.print("Nhập điểm: ");
        int studentMark = nhap.nextInt();
        
        this.setId(studentId);
        this.setName(studentName);
        this.setAge(studentAge);
        this.setMark(studentMark);
    }
    
    @Override
    public void display(){
        System.out.println("Mã sinh viên: " + this.getId());
        System.out.println("Họ tên: " + this.getName());
        System.out.println("Tuổi: " + this.getAge());
        System.out.println("Điểm: " + this.getMark());
        System.out.println("Thứ hạng: " + this.getGrade());
    }
}