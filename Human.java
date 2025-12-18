package model;

public class Human {

    private String name;
    private int age;
    private boolean active;

    public Human(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", age: " + age);
    }

    public void dailyActivity() {
        System.out.println("Human does daily activities.");
    }
}