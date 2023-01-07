/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import service.menu.inter.MenuUnknownServiceInter;
import util.Menu;

/**
 *
 * @author Lenovo
 */
public class MenuUnknownService implements MenuUnknownServiceInter{

    
    public void processLogic() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void process() {
        System.err.println("INVALID CHOICE!PLEASE SELECT CORRECT NUMBER[1,5]");
       
    }
    
}
