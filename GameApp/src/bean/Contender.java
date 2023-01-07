/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Lenovo
 */
public class Contender extends Person {

    private String name;
    private String surname;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Contender(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Contender() {
    }

    public String getFullInfo() {
        return this.getName() + " " + this.getSurname();
    }

}
