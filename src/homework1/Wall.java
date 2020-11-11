package homework1;

public class Wall implements Obstacle_race {
    String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public boolean moving(Actions actions) {
        if (actions.height() >= height) {
            System.out.println(actions.name() + " преодолел припятствие " + name);
            return true;
        } else {
            System.out.println(actions.name() + " не преодолел припятствие " + name);
            return false;
        }
    }
}

