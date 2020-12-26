package part2.lesson1;

public class Treadmill implements Obstacles {
    private int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    public int getLimit() {
        return lenght;
    }

    public String getObstaclesType() {
        return "Treadmill";

    }

    public void successfull() {
        System.out.println("пробежал!");

    }

    public void notSuccessfull() {
        System.out.println("не пробежал!");
    }
}
