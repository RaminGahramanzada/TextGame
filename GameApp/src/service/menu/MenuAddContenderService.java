/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Contender;
import gameapp.Config;
import service.menu.inter.MenuAddContenderServiceInter;
import util.ContenderUtil;
import util.InputUtil;
import util.MenuUtil;

/**
 *
 * @author Lenovo
 */
public class MenuAddContenderService implements MenuAddContenderServiceInter {

    @Override
    public void process() {
        System.out.println("***Add Contender***");
        int count = InputUtil.requireNumber("How many contenders you will add?");
        Config.contenders = new Contender[count];
        for (int i = 0; i < count; i++) {

            Config.contenders[i] = ContenderUtil.fillContender();
        }
        ContenderUtil.printAllRegisteredContenders();
        MenuUtil.showSuccessOpMessage();
        System.out.println("****************");

    }

    @Override
    public void processLogic() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
