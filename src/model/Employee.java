package model;

public class Employee extends Human {

    private String position;
    private float salary;

    // static field
    public static String companyName = "TechCompany";

    public Employee(String name, int age, boolean active,
                    String position, float salary) {
        super(name, age, active);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void dailyActivity() {
        System.out.println("Employee is working.");
    }

    public void work() {
        System.out.println("Works as " + position + " in " + companyName);
    }
}