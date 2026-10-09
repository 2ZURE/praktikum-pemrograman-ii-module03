package module03.problem01;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfDice = input.nextInt();

        LinkedList<Dice> diceRolls = new LinkedList<>();

        int total = 0;
        for (int i = 0; i < numberOfDice; i++) {
            diceRolls.add(new Dice());
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + diceRolls.get(i).getNumber());

            total += diceRolls.get(i).getNumber();
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}