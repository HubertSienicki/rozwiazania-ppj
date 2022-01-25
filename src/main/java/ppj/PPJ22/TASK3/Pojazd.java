/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ22.TASK3;

/**
 *
 * @author kneiv
 */
public class Pojazd {
   private String kolor;

    public Pojazd(String kolor) {
        this.kolor = kolor;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Pojazd{" + "kolor=" + kolor + '}';
    }
   
   
}
