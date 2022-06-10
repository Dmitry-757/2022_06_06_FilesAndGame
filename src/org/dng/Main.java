package org.dng;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final String fileName = "GameDat.txt";

    public static void main(String[] args) {
        Path path = Path.of("GameDat.txt");
        if(Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        menu();
        System.out.println("Results of past games are:");
        ReadWrite.readFromDisk().forEach(System.out::println);
        sc.close();
    }

    public static Scanner getSc() {
        return sc;
    }

    public static String getFileName() {
        return fileName;
    }

    public static void menu(){
        try(Scanner sc = new Scanner(System.in)) {
            boolean breakGame = false;
            while (!breakGame) {
                System.out.println("let`s try playing ;)");
                Game.play();
                System.out.println("Continue ?");
                System.out.println("Yes/No == 1/2");

                if (sc.hasNextInt())
                    if (sc.nextInt() != 1) {
                        breakGame = true;
                    }
            }
        }
    }

}
