package java2_assignment;

import java.io.Serializable;

public class Employee implements Serializable{
    private String empID;
    private String empName;
    private int empAge;
    private String empAddress;
    private String empEmail;
    private double empSalary;
    private String empPosition;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return empAge;
    }

    public void setAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }
    
    @Override
    public String toString(){
        return empID + " " + empName + " " + empAge + " " +
                empAddress + " " + empEmail + " " + empSalary + " "
                + empPosition;
    }
}