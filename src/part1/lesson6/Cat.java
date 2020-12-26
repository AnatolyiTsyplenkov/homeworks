package part1.lesson6;

public class Cat extends Animal{
    private double runLimit = 200.0;
    private double jumpLimit = 2.0;

    public Cat(String name, int age) {
        super(name, age);
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
    public double getRunLimit() {
        return runLimit;
    }

    @Override
    public double getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public void swim(double value) {
        System.out.println("swim: Кошка " + this.getName() + " не умеет плавать!");
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
}
