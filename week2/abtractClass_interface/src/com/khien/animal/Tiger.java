package com.khien.animal;

import com.khien.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "tiger: roarrrr!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
