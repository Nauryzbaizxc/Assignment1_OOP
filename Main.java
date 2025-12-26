import model.Employee;
import model.Human;
import model.Student;
import model.interfaces.IStudyable;
import model.interfaces.IWorkable;

public class Main {
    public static void main(String[] args) {

        // Reference as class
        Employee employee = new Employee(
                "Alex", 30, true,
                "Developer", 4000f
        );

        // Reference as superclass
        Human studentHuman = new Student(
                "Anna", 19, true,
                "Computer Science", 3.8f
        );

        // Reference as interface
        IStudyable studyableStudent = new Student(
                "Bob", 20, true,
                "Math", 3.5f
        );

        IWorkable workableEmployee = employee;

        employee.introduce();
        employee.dailyActivity();
        employee.work();
        employee.getSalaryInfo();
        employee.study();
        employee.exam();

        System.out.println();

        studentHuman.introduce();
        studentHuman.dailyActivity();

        studyableStudent.study();
        studyableStudent.exam();

        ((Student) studentHuman).showUniversity();
    }
}