package animals;

public abstract class Animal {
    protected int age;
    protected int weight;
    protected int countLimbs;

    Animal(int age, int weight, int countLimbs){
        this.age = age;
        this.weight = weight;
        this.countLimbs = countLimbs;
    }
    public abstract int getMaxWeight();

    public void feed(int foodWeight){
        if(this.weight + foodWeight <= getMaxWeight()) {
            this.weight =+foodWeight;
        }
        else{
            System.out.println("Max weight exceeded");
        }
    }

    public int getBirthYear() {

        return this.age;
    }

    public void setBirthYear(int birthYear) {

        this.age = birthYear;
    }

    public int getWeight() {

        return this.weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getLimbsCount() {

        return this.countLimbs;
    }

    public void setLimbsCount(int countLimbs) {

        this.countLimbs = countLimbs;
    }

    public abstract String getType();

    public abstract int compareTo(Lion o);
    public abstract int compareTo(Wolf o);

}