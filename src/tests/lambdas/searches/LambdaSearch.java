package tests.lambdas.searches;

import tests.lambdas.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, false));

        print(animals, animal -> animal.canHop());
        print(animals, (animal) -> animal.canSwim());
        print(animals, (Animal animal) -> !animal.canHop());
        print(animals, (Animal animal) -> { int a = 0; return !animal.canHop(); });
    }

    public static void print(List<Animal> animals, Predicate<Animal> checker) {
        animals.stream().forEach(animal -> {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        });
        System.out.println();
    }

}
