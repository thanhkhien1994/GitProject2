package com.khien.animal;

import com.khien.edible.Edible;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals
             ) {
            System.out.println(animal.makeSound());
        }
    }
}
