/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;


enum rulingFamilies {
    Lannister, Robert
}
/**
 *
 * @author sylvain
 */
public class RollingFamilly {

    private int key = 5;

    public Iking getKing() {
        Iking king;

        if (condition()) {
            king = new KingRobert();
        } else {
            king = new KingLannister();
        }

        return king;
    }

    public IHandOfTheKing getHandOfTheKing() {
        IHandOfTheKing hand;

        if (condition()) {
            hand = new HandOfTheKingStark();
        } else {
            hand = new HandOfTheKingLannister();
        }

        return hand;
    }

    public void toggleRollingFamily() {
        key = (int) Math.random();
    }
    
    /*get king builder*/

    private boolean condition() {
        if(rulingFamilies.Robert.equals("Robert")) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
