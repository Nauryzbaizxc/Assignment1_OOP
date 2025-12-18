package model;

public class Student extends Human {

    private String major;
    private float gpa;

    public Student(String name, int age, boolean active,
                   String major, float gpa) {
        super(name, age, active);
        this.major = major;
        this.gpa = gpa;
    }

    // getters and setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public void dailyActivity() {
        System.out.println("Student is studying.");
    }

    public void study() {
        System.out.println("Studies " + major);
    }
}