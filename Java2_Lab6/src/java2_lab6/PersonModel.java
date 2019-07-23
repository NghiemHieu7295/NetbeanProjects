package java2_lab6;

import java.util.ArrayList;

public class PersonModel<T> {

    public ArrayList<T> li = new ArrayList<>();
    
    public void addObject(T obj){
        li.add(obj);
    }
    
    public void display(){
        for(T e : li){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Nghiem Manh Hieu", 24);
        Student s2 = new Student("S002", "Nghiem Manh Tuan", 24);
        PersonModel<Student> p1 = new PersonModel<>();
        p1.addObject(s1);
        p1.addObject(s2);
        p1.display();
        System.out.println();
        
        Employee e1 = new Employee("E001", "Nghiem Duc Minh", 8000000);
        Employee e2 = new Employee("E002", "Nghiem Manh Duc", 9000000);
        PersonModel<Employee> p2 = new PersonModel<>();
        p2.addObject(e1);
        p2.addObject(e2);
        p2.display();
        System.out.println();
        
        PersonModel<String> p3 = new PersonModel<>();
        p3.addObject("Nghiem Manh Hieu");
        p3.addObject("Nghiem Huong Giang");
        p3.display();
    }   
}