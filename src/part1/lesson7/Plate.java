package part1.lesson7;

public class Plate {
    private int food;

    public void addFood(int food) {
        this.food += food;
    }

    public int getFood() {
        return food;
    }

    public void printInfo() {
        System.out.println("В миске осталось " + food + " еды!");
    }

    public void decreaseFood(int food) {
        if (food > 0 && this.food >= food) {
            this.food -= food;
        } else if (this.food < food){
            System.out.println("В миске не может остаться отрицательное количество еды!");
        } else {
            System.out.println("Значение еды для уменьшения не может быть меньше или равно нулю!");
        }
    }
}
