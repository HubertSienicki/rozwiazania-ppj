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
public class Osoba {
    private String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
    
    public String wyswietl(){
        return this.imie;
    }
    
}
