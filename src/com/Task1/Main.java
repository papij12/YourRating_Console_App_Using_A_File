package com.Task1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int option;
        System.out.println("Welcome to my dumb application");
        System.out.println("""
                1.LOAD
                2.SAVE
                """);
        Scanner input = new Scanner(System.in);
        option = input.nextInt();
        switch (option) {
            case 1 -> MENU.My_menu(MENU.Menu.LOAD);
            case 2 -> MENU.My_menu(MENU.Menu.SAVE);
            default -> System.out.println("wrong Input");
        }
    }
}
