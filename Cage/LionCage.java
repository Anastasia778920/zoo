package Cage;

import animals.Animal;
import animals.Lion;
import animals.LionComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class LionCage implements AnimalCage<Lion>{
    private int foodWeight;
    private int garbageWeight;
    private ArrayList<Lion> lions;

    public LionCage() {

        this.lions = lions;
    }

    public void setLions(ArrayList lions) {

        this.lions = lions;
    }

    public void setFoodWeight(int foodWeight) {

        this.foodWeight = foodWeight;
    }
    public void setGarbageWeight(int garbageWeight) {

        this.garbageWeight = garbageWeight;
    }

    public int getFoodWeight() {

        return foodWeight;
    }

    public int getGarbageWeight() {

        return garbageWeight;
    }

    public ArrayList<Lion> getLions() {

        return lions;
    }

    @Override
    public int addAnimal(Lion animal) {
        if (animal.getType().equals("lion")) {
            lions.add((Lion) animal);
        }
        return lions.size();
    }

    @Override
    public void giveFood(int foodWeight) {
        int tmpFood = foodWeight + this.foodWeight;
        try {
            for (Animal wolf : lions) {
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
        } else {
            this.garbageWeight = 0;
        }
    }

    @Override
    public Animal takeOffAnimal() {
        if (lions == null) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(lions.size());
            return (Lion) lions.remove(i);
        }
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "foodWeight=" + foodWeight +
                ", garbageWeight=" + garbageWeight +
                ", lions=" + lions +
                '}';
    }

    public void sortLions() {
        Collections.sort(lions, new LionComparator());
    }
    /*
    reason: no instance(s) of type variable(s) T exist so that Lion conforms to Comparable<? super T>
     */
    public void sortByVolume(){
        Collections.sort(lions, new LionComparator());
    }
}