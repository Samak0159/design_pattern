/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author sylvain
 */
public class Main {

    public static void main(String[] args) {
        Boolean crash = false;
        WalKingDead w1 = new WalKingDead(5, 10);
        WalKingDead w2;

        try {
            //w2 = new WalKingDead(w1.getLenghtArm(), w2.getLenghtLeg());
        } catch (Exception e) {
            crash = true;
        }

        if (crash) {
            System.out.println("error sur l'instanciation");
        }

        WalKingDead w3 = w1;
        
        if(w3 == w1){
            System.out.println("error meme adresse memoire");
        }

        WalKingDead w4 = w1.clone();
        
        if(w4==w1){
            System.out.println("error meme adresse memoire(w4)");
        }
    }
}
