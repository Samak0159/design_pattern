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
public class Main {

    public static void main(String args[]) {
        LordOfLight god = LordOfLight.getInstance();
        System.out.println(god);

        god = LordOfLight.getInstance();
        System.out.println(god);
    }
}
