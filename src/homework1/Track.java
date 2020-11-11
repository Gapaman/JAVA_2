package homework1;

public class Track implements Obstacle_race {
    String name;
    int track_length;

    public Track(String name, int length) {
        this.name = name;
        this.track_length = length;

    }

    @Override
    public boolean moving(Actions actions) {
        if (actions.distance() >= track_length) {
            System.out.println(actions.name() + " преодолел припятствие " + name);
            return true;
        } else {
            System.out.println(actions.name() + " не преодолел припятствие " + name);
            return false;
        }
    }
}
