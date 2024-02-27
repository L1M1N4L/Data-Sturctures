package Exercise1.Part2;

public class Dog extends Animal {
    public Dog() {
        super("Canis", "familiaris");
    }

    @Override
    public void sound() {
        System.out.println("Woof woof!");
    }
}
