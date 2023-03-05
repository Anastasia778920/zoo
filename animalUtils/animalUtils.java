package animalUtils;

import animals.Animal;
import animals.AnimalAgeComparator;

import java.util.ArrayList;
import java.util.Collections;

public class animalUtils {
    static <T extends Animal> void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList,new AnimalAgeComparator());
    }
}
