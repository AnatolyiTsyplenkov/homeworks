package part2.lesson1;

public class Wall implements Obstacles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getLimit() {
        return this.height;
    }

    public String getObstaclesType(){
        return "Wall";
    }

    public void successfull()  {
        System.out.println("перепрыгнул!");

    }

    public void notSuccessfull()  {
        System.out.println("не перепрыгнул!");
    }


}
