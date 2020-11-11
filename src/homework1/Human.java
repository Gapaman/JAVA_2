package homework1;

public class Human implements Actions {
    private String name;
    int max_run_distance;

    int max_jump_height;


    public Human(String name, int max_run_distance, int max_jump_height) {
        this.name = name;
        this.max_run_distance = max_run_distance;
        this.max_jump_height = max_jump_height;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(name + " бежит по дорожке");

    }

    @Override
    public int distance() {
        return max_run_distance;
    }

    @Override
    public void jump() {
        System.out.println(name + " перепрыгивает стенку");
    }

    @Override
    public int height() {
        return max_jump_height;
    }
}
