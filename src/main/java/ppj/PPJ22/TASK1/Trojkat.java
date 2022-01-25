/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ22.TASK1;

/**
 *
 * @author kneiv
 */
public class Trojkat {
    private int bok;

    public Trojkat(int bok) {
        this.bok = bok;
    }

    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
    }
    
    public double returnArea(){
        return (this.bok * Math.sqrt(3)) / 2;
    }
}
