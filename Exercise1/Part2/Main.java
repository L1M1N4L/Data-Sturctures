package Exercise1.Part2;

public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        System.out.println("Monkey:");
        monkey.sound();
        System.out.println("Genus: " + monkey.getGenus());
        System.out.println("Species: " + monkey.getSpecies());

        Dog dog = new Dog();
        System.out.println("\nDog:");
        dog.sound();
        System.out.println("Genus: " + dog.getGenus());
        System.out.println("Species: " + dog.getSpecies());

        Alvin alvin = new Alvin();
        System.out.println("\nAlvin:");
        alvin.sound();
        System.out.println("Genus: " + alvin.getGenus());
        System.out.println("Species: " + alvin.getSpecies());
    }
}
