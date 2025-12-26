package model;

import model.interfaces.IStudyable;
import model.interfaces.IWorkable;

public class Employee extends Human implements IWorkable, IStudyable {

    private String position;
    private float salary;

    public Employee(String name, int age, boolean active,
                    String position, float salary) {
        super(name, age, active);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void dailyActivity() {
        System.out.println("Employee is working daily.");
    }

    @Override
    public void work() {
        System.out.println("Employee works as " + position);
    }

    @Override
    public void getSalaryInfo() {
        System.out.println("Salary: " + salary);
    }

    @Override
    public void study() {
        System.out.println("Employee studies for professional growth.");
    }

    @Override
    public void exam() {
        System.out.println("Employee passes certification exam.");
    }
}