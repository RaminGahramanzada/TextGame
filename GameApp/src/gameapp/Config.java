/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameapp;

import bean.Contender;

/**
 *
 * @author Lenovo
 */
public class Config {

    public static Contender[] contenders = null;

    private static Config config = null;
    private static boolean loggedIn;

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static Config instance() {//Singleton pattern
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public Contender[] getContenders() {
        return contenders;
    }

    public static boolean isLoggendIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

}
