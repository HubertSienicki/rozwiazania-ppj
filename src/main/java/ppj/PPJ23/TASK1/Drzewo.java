/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ23.TASK1;

import java.util.Arrays;

/**
 *
 * @author kneiv
 */
public class Drzewo {
    Owoc tab[];
    
    public Drzewo() {
    this.tab = new Owoc[100];
    }
    
    public void zerwijOwoc(){
        double mass = 0;
        int index = 0;
        while(mass < 5.0){
            int rand = (int)(Math.random() * (3 - 1)) + 1;
            switch(rand){
                case 1:
                    this.tab[index] = new Jablko();
                    mass += this.tab[index].getMasa();
                    index += 1;
                    
                case 2:
                    this.tab[index] = new Pomarancza();
                    mass+= this.tab[index].getMasa();
                    index += 1;
                    
                case 3:
                    this.tab[index] = new Gruszka();
                    mass += this.tab[index].getMasa();
                    index += 1;
            }
            System.out.println(
                                "Current index :" + index + "\n" + 
                                "Current mass: " + mass + "\n" + 
                                "All fruits: " + Arrays.toString(tab)
            );
        }
        int jablkoCount = 0;
        int pomaranczaCount = 0; 
        int gruszkaCount = 0;
        
        for (int i = 0; i < this.tab.length; i++) {
            if(this.tab[i] == null){
                
            }
            else if(this.tab[i].getNazwa() == "Jablko"){
                jablkoCount+= 1;
            }else if(this.tab[i].getNazwa() == "Pomarancza"){
                pomaranczaCount += 1;
            }else{
                gruszkaCount += 1;
            }
        }
        System.out.println("Ilosc Jablek: " + jablkoCount + "\n" + 
                            "Ilosc pomaranczy: " + pomaranczaCount + "\n" + 
                            "Ilosc gruszek: " + gruszkaCount + "\n");
    }
}
