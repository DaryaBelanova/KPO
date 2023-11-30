package seminar4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Student vasya = new Student("Вася", "Васильев");
        vasya.addGrade(5);
        vasya.addGrade(2);
        vasya.addGrade(4);
        vasya.addGrade(5);
        vasya.addGrade(2);
        persons.add(vasya);

        Staff bossProfessora = new Staff("Петр", "Петров", "89997778899");
        bossProfessora.increaseSalary(100);
        persons.add(bossProfessora);

        Professor professorIvanov = new Professor("Иван", "Иванов");
        professorIvanov.assignBoss(bossProfessora);
        professorIvanov.increaseSalary(100000);
        persons.add(professorIvanov);

        for (Person person : persons) {
            System.out.println(person.toString());
        }

        List<Student> students = new ArrayList<>();
        Student s2 = new Student("Студент", "2");
        s2.addGrade(2);
        s2.addGrade(2);
        s2.addGrade(4);
        s2.addGrade(5);
        Student s1 = new Student("Студент", "1");
        s1.addGrade(1);
        s1.addGrade(1);
        s1.addGrade(5);
        s1.addGrade(3);
        students.add(s2);
        students.add(s1);
        students.sort(Comparator.comparing((Student st) -> st.getGrades().stream().reduce(0, Integer::sum)));
        System.out.println(students);
    }
}
