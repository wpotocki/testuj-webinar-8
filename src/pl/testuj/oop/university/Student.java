package pl.testuj.oop.university;


// w java mogę dziedziczyć tylko po jednej klasie (nie licząc Object)
public class Student extends Person {
    private String department;

    public Student() {
        System.out.println("Create Students");
    }

    @Override
    public void introducte() {
        System.out.println("Introducte from Student");
        super.introducte(); // super - wywołanie z klasy bazowej (po której dziedziczymy)
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
