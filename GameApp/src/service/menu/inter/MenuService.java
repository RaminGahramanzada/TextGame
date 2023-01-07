/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.menu.inter;

/**
 *
 * @author Lenovo
 */
public interface MenuService{
 
    public abstract void processLogic();
    
    public default void process(){
      processLogic();
}
}
