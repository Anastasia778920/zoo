package Cage;

import animals.Animal;
import animals.Wolf;
import animals.WolfAgeComparator;
import animals.WolfWeightComparator;
import animals.WolfIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Iterator;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {
    private ArrayList<Wolf> wolves;
    private int foodWeight;
    private int garbageWeight;

    public WolfCage(ArrayList<Wolf> wolves) {
        this.wolves = this.wolves;
    }

    public void setWolves(ArrayList<Wolf> wolves) {

        this.wolves = wolves;
    }

    public int getFoodWeight() {

        return foodWeight;
    }

    public void setFoodWeight(int foodWeight) {

        this.foodWeight = foodWeight;
    }

    public int getGarbageWeight() {

        return garbageWeight;
    }

    public void setGarbageWeight(int garbageWeight) {

        this.garbageWeight = garbageWeight;
    }

    @Override
    public int addAnimal(Wolf animal) {
        if(animal.getType().equals("wolf")){
            wolves.add((Wolf) animal);
        }
        return wolves.size();
    }

    @Override
    public void giveFood(int foodWeight) {
        int tmpFood = foodWeight + this.foodWeight;
        try {
            for (Animal wolf : wolves) {
                wolf.feed(tmpFood);
                if (tmpFood > wolf.getMaxWeight()) {
                    tmpFood -= wolf.getMaxWeight();
                } else {
                    tmpFood = 0;
                }
            }
            this.foodWeight = tmpFood;
        }
        catch (Exception e){
            this.foodWeight = 0;
            this.garbageWeight = tmpFood;
        }

    }

    @Override
    public void cleanCage(int garbageWeight) {
        if (garbageWeight < this.garbageWeight) {
            this.garbageWeight -= garbageWeight;
        }
        else {
            this.garbageWeight = 0;
        }
    }

    public Wolf takeOffAnimal(){
        if(wolves == null){
            return null;
        }
        else {
            Random random = new Random();
            int i = random.nextInt(wolves.size());
            return (Wolf) wolves.remove(i);
        }
    }

    public void wolfWeightSort(){
        Collections.sort(wolves, new WolfWeightComparator());
    }

    public void wolfAgeSort(){
        Collections.sort(wolves, new WolfAgeComparator());
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolves);
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "foodWeight=" + foodWeight +
                ", garbageWeight=" + garbageWeight +
                ", wolves=" + wolves +
                '}';
    }

}