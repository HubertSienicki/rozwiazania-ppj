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
public class Prostokat {
    private final int a;
    private final int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }
    
    public int returnArea(){
        return this.a * this.b;
    }
    
    @Override
    public String toString(){
        return "Bok a: " + this.a + ", " + "bok B: " + this.b;
    }
    
}
