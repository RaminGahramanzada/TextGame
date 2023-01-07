/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MenuUtil {

    public static void showMenu() {
        Menu.showAllMenu();
        System.out.println("Please select menu");

        Scanner sc = new Scanner(System.in);

        int selectedMenuNumber = sc.nextInt();

        Menu selectedMenu = Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }

    public static String requireName() {
        return InputUtil.requireText("Enter name");
    }

    public static String requireSurname() {
        return InputUtil.requireText("Enter surname");
    }

    public static void showSuccessOpMessage() {
        System.out.println("Operation completed successfully");
    }
}
