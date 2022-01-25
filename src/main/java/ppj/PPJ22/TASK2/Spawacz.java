/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ22.TASK2;

/**
 *
 * @author kneiv
 */
public class Spawacz extends Osoba {
    private int stazpracy;

    public Spawacz(int stazpracy, String imie) {
        super(imie);
        this.stazpracy = stazpracy;
    }

    public int getStazpracy() {
        return stazpracy;
    }

    public void setStazpracy(int stazpracy) {
        this.stazpracy = stazpracy;
    }
    
    @Override
    public String wyswietl(){
        return this.stazpracy + super.wyswietl();
    }
}
