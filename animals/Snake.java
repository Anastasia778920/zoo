package animals;

public class Snake extends Animal {
    protected static int bodyLength;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "animals.Snake";

    public Snake(int age, int weight, int countLimbs, int bodyLength) {

        super(age, weight, countLimbs);
        Snake.bodyLength = bodyLength;
    }

    @Override
    public int getMaxWeight() {

        return MAX_WEIGHT;
    }

    @Override
    public String getType() {

        return TYPE;
    }

    public int getBodyLength() {

        return Snake.bodyLength;
    }

    public static void setBodyLength(int bodyLength) {

        Snake.bodyLength = bodyLength;
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