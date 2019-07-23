package java2_lab1;

public abstract class Person implements personExample{
    protected String id;
    protected String name;
    protected int age;

    public Person(){
        this.id = null;
        this.name = null;
        this.age = 0;
    }
    
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}