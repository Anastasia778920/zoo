package Cage;

import animals.Animal;
import animals.AnimalAgeComparator;

import java.util.ArrayList;
import java.util.Collections;

public interface AnimalCage<T extends Animal> {
    int addAnimal(T t);

    void giveFood(int foodWeight);


    void cleanCage(int garbageWeight);

    Animal takeOffAnimal();

    default void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList,new AnimalAgeComparator());
    }
}