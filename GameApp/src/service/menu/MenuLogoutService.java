/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import gameapp.Config;
import service.menu.inter.MenuLogoutServiceInter;
import util.Menu;
import static util.Menu.LOGIN;
import util.MenuUtil;

/**
 *
 * @author Lenovo
 */
public class MenuLogoutService  implements MenuLogoutServiceInter{

    @Override
    public void process() {
       System.out.println("***Logout***");
       MenuUtil.processMenu(LOGIN);
     
    }

    @Override
    public void processLogic() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    
}
