package model;

import model.interfaces.IStudyable;

public final class Student extends Human implements IStudyable {

    private String major;
    private float gpa;

    public final String university = "ABC University";

    public Student(String name, int age, boolean active,
                   String major, float gpa) {
        super(name, age, active);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public void dailyActivity() {
        System.out.println("Student is studying daily.");
    }

    @Override
    public void study() {
        System.out.println("Student studies " + major);
    }

    @Override
    public void exam() {
        System.out.println("Student passes exams.");
    }

    public final void showUniversity() {
        System.out.println("University: " + university);
    }
}