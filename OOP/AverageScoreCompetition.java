package OOP;

import java.util.Scanner;

public class AverageScoreCompetition {
    private double x;
    private double y;
    private double a;
    private double b;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        AverageScoreCompetition obj = new AverageScoreCompetition();

        obj.x = read.nextDouble();
        obj.y = read.nextDouble();
        obj.a = read.nextDouble();
        obj.b = read.nextDouble();
        double avgScore = obj.getAverageScore();
        read.close();
        System.out.println(avgScore);
    }

    private double getAverageScore() {
        return ((this.x + this.y + this.a + this.b) / 4);
    }
}
