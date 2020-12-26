package part2.lesson1;

public class Man implements Member {
    String name;
    private int runLimit;
    private int jumpLimit;

    public Man(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public void run() {
        System.out.println(this.name + " бежит!");
    }

    public void jump() {
        System.out.println(this.name + " прыгает!");
    }
}
