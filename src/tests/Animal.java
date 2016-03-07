package tests;

public abstract class Animal {

    Animal() {
    }

    abstract void getUp();

}

class Dog extends Animal {

    void getUp() {

        int x = 0;
        while(++x < 5) { x+=1; }
        String message = x > 5 ? "Greater than" : "Less Than";
        System.out.println(message+","+x);

    }

    public static void main(String[] args) {
        new Dog().getUp();
    }

}
