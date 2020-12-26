package part2.lesson1;

public class Main {

    public static void main(String[] args) {

        Member[] members = {
                new Cat("Барсик", 100, 15),
                new Man("Человек", 200, 25),
                new Robot("Робот", 250, 50),
        };

        Obstacles[] obstacles = {
                new Wall(20),
                new Treadmill(220),
        };

        for (Obstacles obstacle : obstacles) {

            for (Member member : members) {

                if (obstacle.getObstaclesType().equals("Wall")) {
                    member.jump();

                    if (member.getJumpLimit() > obstacle.getLimit()) {
                        obstacle.successfull();
                    } else obstacle.notSuccessfull();

                } else {
                    member.run();

                    if (member.getRunLimit() > obstacle.getLimit()) {
                        obstacle.successfull();
                    } else obstacle.notSuccessfull();

                }

            }

        }

    }

}
