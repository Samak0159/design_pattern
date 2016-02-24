/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author sylvain
 */
public class LordOfLight {

    private static LordOfLight _instance = null;

    private LordOfLight() {

    }

    public static LordOfLight getInstance() {
        if (_instance == null) {
            _instance = new LordOfLight();
        }

        return _instance;
    }
}
