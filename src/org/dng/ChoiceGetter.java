package org.dng;

import java.util.Random;
import java.util.Scanner;

public class ChoiceGetter {
    public static VariantsOfChoice choiceOfPlayer() {
        int res = 0;
        Scanner sc = Main.getSc();
//        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose an option: 1-Rock, 2-Scissors, 3-Paper");
            if (sc.hasNextInt()) {
                res = sc.nextInt();
                while ((res < 1) || (3 < res)) {
                    res = sc.nextInt();
                    System.out.println("Wrong choice! Available only 1,2,3!");
                }
            }
//        }

        return (
                switch (res) {
                    case 1 -> VariantsOfChoice.ROCK;
                    case 2 -> VariantsOfChoice.SCISSORS;
                    default -> VariantsOfChoice.PAPER;
                }
        );
    }

    public static VariantsOfChoice choiceOfComputer() {
        return VariantsOfChoice.values()[(new Random()).nextInt(VariantsOfChoice.values().length)];
    }
}
