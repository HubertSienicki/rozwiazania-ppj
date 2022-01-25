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
public class Prostopadloscian extends Prostokat {
    private int c;

    public Prostopadloscian(int c, int a, int b) {
        super(a, b);
        this.c = c;
    }
    
    public Prostopadloscian(int a, int b) {
        super(a, b);
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    @Override
    public int returnArea(){
        return 2 * (super.getA() * super.getB() + super.getA() * this.c + super.getB() * this.c);
    }
    
}
