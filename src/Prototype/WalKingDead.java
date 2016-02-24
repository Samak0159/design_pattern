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
public class WalKingDead implements Prototype<WalKingDead> {
    private int lenghtArm;
    private int lenghtLeg;
    
    public WalKingDead(int lenghtArm, int lenghtLeg) {
        this.lenghtArm = lenghtArm;
        this.lenghtLeg = lenghtLeg;
    }
    
    @Override
    public WalKingDead clone(){
        return new WalKingDead(lenghtArm,lenghtLeg);
    }    

    public void setLenghtArm(int lenght) {
        this.lenghtArm = lenght;
    }

    @Override
    public String toString() {
        return "WalKingDead{" + "lenghtArm=" + lenghtArm + ", lenghtLeg=" + lenghtLeg + '}';
    }
}
