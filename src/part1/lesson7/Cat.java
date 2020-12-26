package part1.lesson7;

public class Cat {
    private String name;
    private boolean satiety = false;

    public Cat(String name) {
        this.name = name;
    }


    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate, int appetite) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            this.satiety = true;
        }
    }

    public void printInfo() {
        String satietyWord = satiety ? "Сыт" : "Голоден";
        System.out.println("Котик " + this.name + " " + satietyWord);
    }
}
