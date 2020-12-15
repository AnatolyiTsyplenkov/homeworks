package lesson6;

public class main {
    public static void main(String[] args) {

        Dog dog_1 = new Dog("Шарик", 3);
        Dog dog_2 = new Dog("Тимка", 5);
        Cat cat_1 = new Cat("Барсик", 1);
        Cat cat_2 = new Cat("Муська", 3);

        dog_1.run(100.0);
        dog_1.jump(0.3);
        dog_1.swim(3);
        System.out.println();

        dog_1.run(700.0);
        dog_1.jump(0.7);
        dog_1.swim(17);
        System.out.println();

        dog_2.run(100.0);
        dog_2.jump(0.3);
        dog_2.swim(3);
        System.out.println();

        dog_2.run(700.0);
        dog_2.jump(0.7);
        dog_2.swim(17);
        System.out.println();

        cat_1.run(100);
        cat_1.jump(0.1);
        cat_1.swim(10);
        System.out.println();

        cat_1.run(700);
        cat_1.jump(4);
        cat_1.swim(500);
        System.out.println();

        dog_1.setRunLimit(100);
        System.out.println("Лимит расстояния бега первой собаки: ");
        System.out.println(dog_1.getRunLimit());
        System.out.println();

        dog_2.setRunLimit(1000);
        System.out.println();
        System.out.println("Лимит расстояния бега второй собаки: ");
        System.out.println(dog_2.getRunLimit());

    }
}
