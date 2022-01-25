/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ22.TASK4;

/**
 *
 * @author kneiv
 */
public class Drzewo {
    private boolean wiecznieZielone;
    private int wysokosc;
    private String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    

    public boolean isWiecznieZielone() {
        return wiecznieZielone;
    }

    public void setWiecznieZielone(boolean wiecznieZielone) {
        this.wiecznieZielone = wiecznieZielone;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public String getPrzekrojDrzewa() {
        return przekrojDrzewa;
    }

    public void setPrzekrojDrzewa(String przekrojDrzewa) {
        this.przekrojDrzewa = przekrojDrzewa;
    }
    
    
    
    @Override
    public String toString(){
        return "{wiecznie zielone: " + this.wiecznieZielone + "\n wysokosc: " + this.wysokosc + "\n przekroj: " + this.przekrojDrzewa + "}";
    }
}
