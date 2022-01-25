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
public class PojazdKolowy extends Pojazd {
    private int iloscOsi;

    public PojazdKolowy(int iloscOsi, String kolor) {
        super(kolor);
        this.iloscOsi = iloscOsi;
    }

    public int getIloscOsi() {
        return iloscOsi;
    }

    public void setIloscOsi(int iloscOsi) {
        this.iloscOsi = iloscOsi;
    }

    @Override
    public String toString() {
        return "PojazdKolowy{" + "iloscOsi=" + iloscOsi + '}';
    }
    
    
}
