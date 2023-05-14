import java.util.*;

public class BowlingGame {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");
                String name = values[0];
                int points = Integer.parseInt(values[1]);
                game.addPlayer(name, points);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        game.getWinner();
    }
}

class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public void getWinner() {
        String winner = "";
        int maxPoints = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            String playerName = entry.getKey();
            int points = entry.getValue();

            if (points > maxPoints) {
                maxPoints = points;
                winner = playerName;
            }
        }

        System.out.println(winner);
    }
}