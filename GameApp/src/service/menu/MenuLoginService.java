/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import gameapp.Config;
import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;
import util.MenuUtil;

/**
 *
 * @author Lenovo
 */
public  class MenuLoginService implements MenuLoginServiceInter {


   

    @Override

    public void process() {
        System.out.println("***Login***");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = sc2.nextLine();

        if (!(username.equals("Ramin") && password.equals("12345"))) {
            for (int i = 0; i <= 2; i++) {
                do {
                    System.out.println("Enter username:");
                    sc1.nextLine();

                    System.out.println("Enter password:");
                    sc2.nextLine();
                    i++;

                    if (i == 2) {

                    }
                } while (i == 2 && !(username.equals("Ramin") && password.equals("12345")));

            }
            System.out.println("You banned");
            System.exit(0);

        }
        MenuUtil.showSuccessOpMessage();
        Config.setLoggedIn(true);

    }

    @Override
    public void processLogic() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
  
}
