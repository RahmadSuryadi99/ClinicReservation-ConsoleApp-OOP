package view;

import java.util.Scanner;

public interface Menu {
    public static Scanner userInput = new Scanner(System.in);

    public  abstract  void run();
}
