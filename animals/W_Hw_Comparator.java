package animals;

import java.util.Comparator;
public class W_Hw_Comparator implements Comparator<Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {
        if((o1.getWeight() > o2.getWeight()) ||
                (o1.getBirthYear() < o2.getBirthYear()) && (o1.getWeight() == o2.getWeight())){
            return 1;
        }
        else if((o1.getWeight() < o2.getWeight()) ||
                (o1.getBirthYear() > o2.getBirthYear()) && (o1.getWeight() == o2.getWeight())){
            return -1;
        }
        return 0;
    }
}