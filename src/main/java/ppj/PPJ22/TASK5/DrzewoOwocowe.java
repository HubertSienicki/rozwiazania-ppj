/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ22.TASK5;

/**
 *
 * @author kneiv
 */
public class DrzewoOwocowe extends DrzewoLisciaste {
    private String nazwaOwoca;

    public DrzewoOwocowe(String nazwaOwoca, int ksztaltLiscia, boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        super(ksztaltLiscia, wiecznieZielone, wysokosc, przekrojDrzewa);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Owocowe, nazwa owoca: " + this.nazwaOwoca;
    }
    
    
}
