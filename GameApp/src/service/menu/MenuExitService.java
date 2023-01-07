/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import service.menu.inter.MenuExitServiceInter;
import util.MenuUtil;

/**
 *
 * @author Lenovo
 */
public class MenuExitService implements MenuExitServiceInter{

    @Override
    public void process() {
        MenuUtil.showSuccessOpMessage();
        System.exit(0);
        
    }

    @Override
    public void processLogic() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

   
    
}
