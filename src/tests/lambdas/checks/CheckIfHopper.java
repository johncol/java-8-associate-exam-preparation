package tests.lambdas.checks;

import tests.lambdas.Animal;

public class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }

}
