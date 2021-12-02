package pl.testuj.oop.university;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Create Person");
    }

    public void introducte() {
        System.out.println("Introducte from person");
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
}
