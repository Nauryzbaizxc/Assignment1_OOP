package model;

public abstract class Human {

    protected String name;
    protected int age;
    protected boolean active;

    public Human(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", age: " + age);
    }

    public abstract void dailyActivity();
}