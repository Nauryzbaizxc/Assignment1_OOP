import model.Employee;
import model.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Is active (true/false): ");
        boolean active = scanner.nextBoolean();

        Employee employee = new Employee(
                name, age, active,
                "Developer", 3000.0f
        );

        Student student = new Student(
                "Anna", 19, true,
                "Computer Science", 3.7f
        );

        employee.setSalary(3500.0f);
        System.out.println(employee.getSalary());

        student.setGpa(3.9f);
        System.out.println(student.getGpa());

        employee.introduce();
        employee.dailyActivity();
        employee.work();

        student.introduce();
        student.dailyActivity();
        student.study();
    }
}
