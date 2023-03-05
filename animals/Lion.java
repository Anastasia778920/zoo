package animals;

public class Lion extends Animal {

    protected int maneVolume;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "animals.Lion";

    public int getManeVolume() {

        return this.maneVolume;
    }

    public void setManeVolume(int maneVolume) {

        this.maneVolume = maneVolume;
    }

    public Lion(int age, int weight, int countLimbs, int maneVolume){
        super(age, weight, countLimbs);
        this.maneVolume = maneVolume;
    }

    @Override
    public int getMaxWeight() {

        return MAX_WEIGHT;
    }

    @Override
    public String getType() {

        return TYPE;
    }

    @Override
    public int compareTo(Lion o) {
        if (this.age > o.getBirthYear()) return 1;
        else if (this.age < o.getBirthYear()) return -1;
        return 0;
    }

    @Override
    public int compareTo(Wolf o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}