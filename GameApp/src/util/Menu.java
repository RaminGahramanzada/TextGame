/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import gameapp.Config;
import service.menu.MenuAddContenderService;
import service.menu.MenuExitService;
import service.menu.MenuLoginService;
import service.menu.MenuLogoutService;

import service.menu.MenuStartGameService;
import service.menu.MenuUnknownService;
import service.menu.inter.MenuService;

/**
 *
 * @author Lenovo
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    ADD_CONTENDER(2, "Add Contender", new MenuAddContenderService()),
    START_GAME(3, "Start Game", new MenuStartGameService()),
    LOGOUT(4, "Logout", new MenuLogoutService()),
    EXIT(5, "Exit", new MenuExitService()),
    UNKNOWN(-1,"INVALID CHOICE", new MenuUnknownService());

    private MenuService service;
    private String label;
    private int number;

    Menu() {
    }

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN || menus[i] == EXIT) {
                    if (!(Config.isLoggendIn())) {
                        System.out.println(menus[i]);
                    }

                } else if (Config.isLoggendIn()) {

                    if (menus[i] == ADD_CONTENDER || menus[i] == EXIT) {
                        System.out.println(menus[i]);

                        if (Config.contenders != null) {

                            System.out.println(menus[2]);
                            System.out.println(menus[3]);
                        }

                    }

                }

            }
        }

    }
}
