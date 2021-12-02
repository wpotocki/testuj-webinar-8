package pl.testuj;

import pl.testuj.oop.Animal;

public class Main {

    public static void main(String[] args) {
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
    }
}
