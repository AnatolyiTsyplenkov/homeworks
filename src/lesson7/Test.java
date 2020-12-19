package lesson7;

public class Test {

    public static void main(String[] args) {
        Plate plate = new Plate();
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Мурзик");
        cats[2] = new Cat("Васька");

        plate.addFood(10);
        System.out.println("В миску положили " + plate.getFood() + " еды!");

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate, ((int) (Math.random() * 10)));

            if (!cats[i].isSatiety()) {
                System.out.println("Для котика " + cats[i].getName() + " мало еды в миске!");
            } else {
                System.out.println("Котик " + cats[i].getName() + " поел!");
            }

        }

        plate.printInfo();

        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();
        }
    }



}
