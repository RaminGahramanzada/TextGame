/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Contender;
import gameapp.Config;
import service.menu.inter.MenuShowContenderServiceInter;

/**
 *
 * @author Lenovo
 */
public class MenuShowContenderService implements MenuShowContenderServiceInter{
    
    public void processLogic(){
       
    Contender [] allContender = Config.instance().getContenders();
        for (int i = 0; i <allContender.length; i++) {
            System.out.println(allContender[i]);
        }
    }
}
