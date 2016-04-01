package tests.casting;

class Animal { }
class Bird extends Animal { }
class Fish extends Animal { }

public class ExampleCasting {
    Bird bird = null;
    Fish fish = null;
    Animal animal;
    {
        bird = new Bird();
        //fish = (Fish) bird;
        fish = new Fish();

        animal = bird;
        animal = fish;
        animal = new Animal();

        // this is going to fail at runtime
        bird = (Bird) animal;
        fish = (Fish) animal;
    }

    public static void main(String[] args) {
        new ExampleCasting();
    }
}
