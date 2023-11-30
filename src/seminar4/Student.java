package seminar4;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<Integer> grades;

    public List<Integer> getGrades() {
        return grades;
    }

    public Student(String name, String lastName) {
        super(name, lastName);
        grades = new ArrayList<>();
    }

    public void expell() {
        System.out.println(toString() + " был отчислен");
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Студент: " + super.toString() + " with grades = " + grades.toString();
    }
}
