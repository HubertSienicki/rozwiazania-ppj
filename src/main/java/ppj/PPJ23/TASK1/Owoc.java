/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ23.TASK1;

/**
 *
 * @author kneiv
 */
public class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        this.masa = (Math.random() * (0.25-0.1)) + 0.1;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }
    
    
    
}
