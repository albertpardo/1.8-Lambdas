package level3ex1;

import level3ex1.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    private static List<Student> getTenStudentList(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Antonella Barber", 20, "PHP", 8.5));
        students.add(new Student("Marco Martelli", 24, "ANGULARr" , 4.1));
        students.add(new Student("Mireia Boch", 30, "JAVA", 9.9));
        students.add(new Student("Francisco Perez", 46, "PHP", 9.1));
        students.add((new Student("Judith Massana", 29, "C++", 9.8)));
        students.add((new Student("Andreu Garcia", 32, "JAVA", 9.2)));
        students.add((new Student("Jordi Baylina", 49, "PHP", 8.9)));
        students.add((new Student("Sergio Ramirez", 22, "PHP", 7.5)));
        students.add((new Student("Ruth Zamora", 26, "JAVA", 4.8)));
        students.add((new Student("Pau Soret", 33, "JAVA", 9.4)));
        return students;
    }

    private static void printFilteredStudents(String msg, List<Student> filterStudents){
        System.out.println(msg);
        filterStudents.forEach(System.out::println);
    }

    private static void printStudentNameAndAge(List<Student> students){
        System.out.println("--- Students Names and Age:");
        students.forEach(student -> System.out.println( student.getName() + ", " + student.getAge()));
    }

    private static void filterAndPrintStudentsWithNameStartWithA(List<Student> students){
        List<Student> filterStudents;

        filterStudents = students.stream().filter(student -> student.getName().toLowerCase().charAt(0) == 'a').toList();
        printFilteredStudents("--- Students with Names start with 'A':", filterStudents);
    }

    private static void filterAndPrintStudentsWithNoteGraterThanFive(List<Student> students){
        List<Student> filterStudents;

        filterStudents = students.stream().filter(student -> student.getNote() > 5.0).toList();
        printFilteredStudents("--- Students with note > 5.0", filterStudents);
    }

    private static void filterAndPrintStudentsWithNoteGraterThanFiveAndNotPhp(List<Student> students){
        List<Student> filterStudents;

        filterStudents = students.stream().filter(student -> ( student.getNote() > 5.0 && !Objects.equals(student.getCourse(), "PHP"))).toList();
        printFilteredStudents("--- Students with note > 5.0 and They are not in 'PHP' course", filterStudents);
    }

    
    public static void main(String[] args){
        List<Student> students;

        students = getTenStudentList();
        printStudentNameAndAge(students);
        filterAndPrintStudentsWithNameStartWithA(students);
        filterAndPrintStudentsWithNoteGraterThanFive(students);
        filterAndPrintStudentsWithNoteGraterThanFiveAndNotPhp(students);
    }
}
