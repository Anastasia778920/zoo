package animals;

public class Wolf extends Animal {
    protected static final int MAX_WEIGHT = 60;
    protected static final String type = "wolf";

    private int height;

    public Wolf(int age, int weight, int countLimbs, int height) {
        super(age, weight, countLimbs);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "height=" + height +
                ", yearBirth=" + age +
                ", weight=" + weight +
                "}\n";
    }
    @Override
    public String getType() {

        return type;
    }

    @Override
    public int getMaxWeight() {

        return MAX_WEIGHT;
    }

    @Override
    public int compareTo(Lion o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public int compareTo(Wolf o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
