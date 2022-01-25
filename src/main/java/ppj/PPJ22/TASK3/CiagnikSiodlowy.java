/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ22.TASK3;

/**
 *
 * @author kneiv
 */
public class CiagnikSiodlowy extends PojazdKolowy {
    private int masa;

    public CiagnikSiodlowy(int masa, int iloscOsi, String kolor) {
        super(iloscOsi, kolor);
        this.masa = masa;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
    
    public void rozpocznijJazde(){
        if((this.masa / super.getIloscOsi()) > 11){
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika!");
        }else{
            System.out.println("Rozpoczynanie jazdy...");
        }
    }

    @Override
    public String toString() {
        return "CiagnikSiodlowy{" + "masa=" + masa + '}';
    }


    
    
}
