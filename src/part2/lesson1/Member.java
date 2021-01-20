package part2.lesson1;

public interface Member {
    void jump();

    void run();

    int getJumpLimit();

    int getRunLimit();

    default void pass(Obstacles obstacles) throws NullPointerException {
        if (obstacles.getObstaclesType().equals("Wall")) {
            this.jump();
            if (obstacles.getLimit() < this.getJumpLimit()) {
                obstacles.successfull();
            } else obstacles.notSuccessfull();

        } else {
            this.run();
            if (obstacles.getLimit() < this.getRunLimit()) {
                obstacles.successfull();

            } else {
                obstacles.notSuccessfull();
            }
        }

    }

}
