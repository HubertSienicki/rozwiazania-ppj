/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ22.TASK5;

import ppj.PPJ22.TASK4.Drzewo;

/**
 *
 * @author kneiv
 */
public class DrzewoIglaste extends Drzewo {
    private int iloscIgiel;
    private double dlugoscSzyszki;

    public DrzewoIglaste(int iloscIgiel, double dlugoscSzyszki, boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString(){
        return "Drzewo: " + super.toString() + "\n" + "{Iglaste: " + "Ilosc igiel: " + this.iloscIgiel + "\n" + "Dlugosc szyszki: " + this.dlugoscSzyszki + "}";
    }
    
    
}
