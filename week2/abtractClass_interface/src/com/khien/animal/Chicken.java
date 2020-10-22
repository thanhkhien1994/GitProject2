package com.khien.animal;

import com.khien.edible.*;
//import com.khien.edible.Edible;

public class Chicken extends Animal implements Abc,Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat(){
        return "could be fried";
    }
}
