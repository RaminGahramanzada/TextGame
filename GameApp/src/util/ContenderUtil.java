/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Contender;
import gameapp.Config;

/**
 *
 * @author Lenovo
 */
public class ContenderUtil {

    public static Contender fillContender() {
        String name = MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();

        Contender cr = new Contender(name, surname);
        return cr;
    }

    public static void printAllRegisteredContenders() {
        if (Config.contenders == null) {
            return;
        }
        for (int i = 0; i < Config.contenders.length; i++) {
            Contender cr = Config.contenders[i];
            System.out.println((i + 1) + "." + cr.getFullInfo());
        }
    }
}
