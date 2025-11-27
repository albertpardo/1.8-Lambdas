package level3ex1.Model;

public class Student {
    private String name;
    private int age;
    private String course;
    private double note;

    public Student (String name , int age, String course, double note){
        this.name = name;
        this.age = age;
        this.course = course;
        this.note = note;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "[name = " + name + ", age = " + age  + ", course = " + course + ", note = " + note + "]";
    }
}
