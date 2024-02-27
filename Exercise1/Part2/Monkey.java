package Exercise1.Part2;

public class Monkey extends Animal {
    public Monkey() {
        super("Macaca", "mulatta");
    }

    @Override
    public void sound() {
        System.out.println("Ooh ooh aah aah!");
    }
}
