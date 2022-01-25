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
public class DrzewoLisciaste extends Drzewo {
    private int ksztaltLiscia;

    public DrzewoLisciaste(int ksztaltLiscia, boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return "Drzewo: " + super.toString() + "Lisciaste: " + "\n" + "{Kszta?t liscia: " + this.ksztaltLiscia + "}";
    }
    
    
}
