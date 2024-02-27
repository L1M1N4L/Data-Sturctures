//import java.io.*;

// Base or Super Class
class Animal {
    String animalType = "land";

    public void sound()
    {
        System.out.println("Psst... no sound");
    }
}

// Inherited or Sub Class
class Dog extends Animal {
    int legs = 4;
    public void sound()
    {
        System.out.println("Woof woof");
    }
}

class Chicken extends Animal {
    int legs = 2;
    public void sound()
    {
        System.out.println("Cluck cluck");
    }
}

class Ant extends Animal {
    int legs = 6;
}

// Driver Class
public class InheritanceExample {
    public static void main(String args[])
    {
        Dog dog = new Dog();
        dog.sound();
        System.out.println("Dog - Type : " + dog.animalType
                + "\nLegs : " + dog.legs + "\n");

        Chicken chicken = new Chicken();
        chicken.sound();
        System.out.println("Chicken Type : " + chicken.animalType
                + "\nLegs : " + chicken.legs + "\n");


        Ant ant = new Ant();
        ant.sound();
        System.out.println("Ant Type : " + ant.animalType
                + "\nLegs : " + ant.legs + "\n");
    }
}