package java2_lab2;

import java.util.Scanner;

public class Student {
    private String studentID;
    private String studentName;
    private double studentMark;
    private String studentGrade;
    private static final String ID = null;
    private static final String NAME = null;
    private static final double MARK = 0.0;
    private static final String GRADE = null;

    public Student(String studentId, String studentName, double studentMark, String studentGrade){
        this.studentID = studentId;
        this.studentName = studentName;
        this.studentMark = studentMark;
        this.studentGrade = studentGrade;
    }
    
    public Student(){
        this(ID, NAME, MARK, GRADE);
    }
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(double studentMark) {
        this.studentMark = studentMark;
    }

    public String getStudentGrade() {
        return studentGrade;
    }
    
    public void setStudentGrade(String studentGrade){
        this.studentGrade = studentGrade;
    }
    
    public void setStudentGrade(){
        if(this.studentMark >= 8){
            this.studentGrade = "Giỏi";
        }else if(this.studentMark >= 7){
            this.studentGrade = "Khá";
        }else if(this.studentMark >= 5){
            this.studentGrade = "Trung bình";
        }else{
            this.studentGrade = "Kém";
        }
    }
    
    public void input(){
        Scanner nhap = new Scanner(System.in);
        boolean valid;
        
        System.out.print("Nhập mã sinh viên: ");
        this.studentID = nhap.nextLine();
        System.out.print("Nhập họ tên: ");
        this.studentName = nhap.nextLine();
        do{    
            try{
                valid = true;
                System.out.print("Điểm: ");
                this.studentMark = nhap.nextDouble();
            }
            catch(Exception e){
                System.out.println("Điểm phải là số.");
                valid = false;
                nhap.next();
            }
        }while(!valid);
    }
    
    @Override
    public String toString(){
        return this.studentID + "\t" + this.studentName + "\t"
                + this.studentMark + "\t" + this.studentGrade;
    }
}