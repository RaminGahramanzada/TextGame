/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import gameapp.Config;
import java.util.Random;
import java.util.Scanner;
import service.menu.inter.MenuStartGameServiceInter;

/**
 *
 * @author Lenovo
 */
public class MenuStartGameService implements MenuStartGameServiceInter {

    @Override
    public void process() {
        System.out.println("Game Started");
        System.out.println("Do you think the numbered contender is the winner?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = Config.contenders.length;
        int winner = randomGenerate(num1);
        if (num == winner) {
            System.out.println("You win");
        } else {
            System.out.println("You failed");
        }

    }
    Random random = new Random();

    public static int randomGenerate(int num) {
        return new Random().nextInt(num + 1);

    }

    @Override
    public void processLogic() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
