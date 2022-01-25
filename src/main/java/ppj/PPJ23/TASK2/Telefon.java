/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ23.TASK2;

/**
 *
 * @author kneiv
 */
public class Telefon {
    String interfejsKomunikacyjny;
    String color;

    public Telefon(String interfejsKomunikacyjny, String color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }
    
    public void zadzwon(String numer){
        System.out.println(numer);
    }
    
    public void wyswietlHistoriePolaczen(){
        System.out.println("Brak historii");
    }
}
