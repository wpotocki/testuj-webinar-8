package pl.testuj.oop;

public class Animal {
    // private oznacza, że tylko w tej klasie (Animal) mamy dostęp do tego pola
    private String name; // pole -> zmienna w klasie

    // konstruktor bezparametrowy
    public Animal() {
        System.out.println("Konstruktor bezparametrowy został uruchomiony");
//        this.name = "Reksio";
    }

    // konstruktor parametrowy
    public Animal(String name) {
        System.out.println("Konstruktor z parametrem został uruchomiony");
        this.name = name;
    }

    // konstruktor kopiujący
    public Animal(Animal animal) {
        this.name = animal.getName();
    }

    public void useVoice() {
        System.out.println("Wydaję głos!");
    }

    // tzw gettery i settery, które służą do pobierania / ustawiania wartości pola
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
