package lesson6;

public class Animal {
    private String name;
    private int age;
    private double runLimit;
    private double jumpLimit;
    private double swimLimit;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getRunLimit() {
        return runLimit;
    }

    public double getJumpLimit() {
        return jumpLimit;
    }

    public double getSwimLimit() {
        return swimLimit;
    }

    public String getName() {
        return name;
    }

    public void run(double value) {
        if (value > 0) {
            if (value < runLimit) {
                System.out.println(this.getName() + " " + "run: " + (value < runLimit));
            } else {
                System.out.println(this.getName() + " " + "run: " + (value < runLimit));
            }
        } else {
            System.out.println("Значение должно быть больше нуля!");
        }

    }

    public void jump(double value) {
        if (value > 0) {
            if (value < jumpLimit) {
                System.out.println(this.getName() + " " + "run: " + (value < jumpLimit));
            } else {
                System.out.println(this.getName() + " " + "run: " + (value < jumpLimit));
            }
        } else {
            System.out.println("Значение должно быть больше нуля!");
        }
    }

    public void swim(double value) {
        if (value > 0) {
            if (value < swimLimit) {
                System.out.println(this.getName() + " " + "run: " + (value < swimLimit));
            } else {
                System.out.println(this.getName() + " " + "run: " + (value < swimLimit));
            }
        } else {
            System.out.println("Значение должно быть больше нуля!");
        }
    }

    public void setRunLimit(double runLimit) {
        if (runLimit < 0) {
            System.out.println("ERROR: Не может быть меншьше нуля!");
        } else this.runLimit = runLimit;
    }

    public void setJumpLimit(double jumpLimit) {
        if (jumpLimit <= 0) {
            System.out.println("ERROR: Не может быть меншьше нуля!");
        } else this.jumpLimit = jumpLimit;
    }

    public void setSwimLimit(double swimLimit) {
        if (swimLimit < 0) {
            System.out.println("ERROR: Не может быть меншьше нуля!");
        } else this.swimLimit = swimLimit;
    }

}
