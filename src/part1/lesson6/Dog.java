package part1.lesson6;

public class Dog extends Animal {
    private double runLimit = 500.0;
    private double jumpLimit = 0.5;
    private double swimLimit = 10.0;

    public Dog(String name, int age) {
        super(name, age);

    }

    @Override
    public double getRunLimit() {
        return runLimit;
    }

    @Override
    public double getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public double getSwimLimit() {
        return swimLimit;
    }

    @Override
    public void run(double value) {
        super.setRunLimit(runLimit);
        super.run(value);
    }

    @Override
    public void jump(double value) {
        super.setJumpLimit(jumpLimit);
        super.jump(value);
    }

    @Override
    public void swim(double value) {
        super.setSwimLimit(swimLimit);
        super.swim(value);
    }

    @Override
    public void setRunLimit(double runLimit) {
        this.runLimit = runLimit;
    }

    @Override
    public void setJumpLimit(double jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void setSwimLimit(double swimLimit) {
        this.swimLimit = swimLimit;
    }
}
