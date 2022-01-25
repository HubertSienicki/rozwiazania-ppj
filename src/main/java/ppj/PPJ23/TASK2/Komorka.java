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
public class Komorka extends Telefon {
    String[] polaczenia;
    int index;

    public Komorka( String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
        this.polaczenia = new String[10];
        this.index = 0;
        
    }
    
    @Override
    public void zadzwon(String numer){
        this.polaczenia[this.index] = numer;
        this.index += 1;
    }

    public String[] getPolaczenia() {
        return polaczenia;
    }

    public void setPolaczenia(String[] polaczenia) {
        this.polaczenia = polaczenia;
    }
    
    @Override
     public void wyswietlHistoriePolaczen(){
         System.out.println("[");
        for (int i = 0; i < this.polaczenia.length; i++) {
            System.out.print(this.polaczenia[i] + " ");
        }
        System.out.println("]");
    }
}
