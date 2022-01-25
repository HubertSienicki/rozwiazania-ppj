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
public class Graniastoslup extends Trojkat {
    private Prostokat p1;

    public Graniastoslup(Prostokat p1, int bok) {
        super(bok);
        this.p1 = p1;
    }

    public Prostokat getP1() {
        return p1;
    }

    public void setP1(Prostokat p1) {
        this.p1 = p1;
    }
    
    @Override
    public double returnArea(){
        return 2 * super.returnArea() + 3 * p1.returnArea();
    }
}
