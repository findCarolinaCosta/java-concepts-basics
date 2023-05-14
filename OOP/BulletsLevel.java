package OOP;

public class BulletsLevel {

    public static void main(String[] args) {

        new Player(Difficulty.EASY);
        new Player(Difficulty.MEDIUM);
        new Player(Difficulty.HARD);
    }
}

enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

class Player {
    Player(Difficulty diff) {
        switch (diff) {
            case EASY:
                System.out.print("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.print("You have 2000 bullets");
                break;
            case HARD:
                System.out.print("You have 1000 bullets");
                break;

            default:
                break;
        }
    }
}