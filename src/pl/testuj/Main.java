package pl.testuj;

import pl.testuj.oop.Animal;
import pl.testuj.oop.university.Exam;
import pl.testuj.oop.university.Person;
import pl.testuj.oop.university.Profesor;
import pl.testuj.oop.university.Student;

public class Main {

    public static void main(String[] args) {
        String y = Person.XXX;
        // typ_zmiennej nazwa_zmiennej = wartość;
        // typ_obiektu nazwa_obiektu = new Typ_Obiektu();
        Animal animal = new Animal();
        animal.setName("Burek");
        System.out.println(animal.getName());

        Animal cat = new Animal();
        cat.setName("Filemon");
        System.out.println(cat.getName());

        animal.useVoice();
        cat.useVoice();

        Animal dog = new Animal();
        System.out.println(dog.getName());

        Animal fish = new Animal("Nemo");
        System.out.println(fish.getName());
        fish.setName("Złota rybka");
        System.out.println(fish.getName());

        Animal dog2 = new Animal(cat);
        System.out.println(dog2.getName());

        System.out.println("---------");

        Person person = new Person();
        person.setAge(30);
        person.introducte();

        System.out.println("-------");

        Student student = new Student();
        student.setDepartment("Informatyka");
        student.setAge(22);
        student.introducte();

//        Profesor profesor = new Profesor();
//        profesor.setGrade("wzorowa");
//        profesor.setAge(55);
//        profesor.introducte();
//
//        Exam exam = new Exam();
//        exam.setDepartment("Filozofia");
//        exam.setName("Egzamin wstępny");
    }
}
