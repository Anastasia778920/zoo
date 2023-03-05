import java.util.ArrayList;
import animals.Lion;
import Cage.LionCage;
import factory.LionsFactory;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(5);
        LionCage lionsInCage = new LionCage();
        System.out.println(lionsInCage);
        lionsInCage.sortByVolume();
        System.out.println(lionsInCage);
    }
}