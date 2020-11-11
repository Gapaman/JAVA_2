package homework1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Олег", 1110, 2);
        Cat cat = new Cat("Барсик", 2000, 4);
        Robot robot = new Robot("T-1000", 50000, 10);
        cat.run();
        cat.jump();
        human.run();
        human.jump();
        robot.run();
        robot.jump();
        System.out.println("__________________________________________________________________________________________");

        Actions[] participant = {human, cat, robot};
        Obstacle_race obstacle[] = {
                new Track("дорожка", 500),
                new Wall("стена", 1),
                new Track("дорожка", 2000),
                new Wall("стена", 4),
                new Wall("стена", 10)
        };
        for (int i = 0; i < participant.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacle.length; j++) {
                result = obstacle[j].moving(participant[i]);

                if (!result) {
                    break;
                }

            }
            if (result) {
                System.out.println("Участник преодолел всю полосу препятствий");
            } else {
                System.out.println("Участник не смог преодолеть все препятствия");
            }
        }

    }
}
