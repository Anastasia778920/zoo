package factory;
import animals.Lion;
import java.util.ArrayList;

public class LionsFactory {
    public static ArrayList<Lion> createLions (int lionCount) {
        ArrayList<Lion> lionInCage = new ArrayList<>();
        for(int i = 0; i < lionCount; i++){
            Lion lion = new Lion(10, 10, 10, 10);
        }
        return  lionInCage;
    }
}