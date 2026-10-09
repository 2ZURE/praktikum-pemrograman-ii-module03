package module03.problem01;

import java.util.Random;

public class Dice {
    private int number;

    public Dice() {
        this.number = rollNumber();
    }

    private int rollNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public int getNumber() {
        return number;
    }
}