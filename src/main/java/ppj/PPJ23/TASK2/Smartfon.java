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
public class Smartfon extends Komorka {
    Osoba[] znajomi;

    public Smartfon(Osoba[] znajomi, String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
        this.znajomi = znajomi;
    }

    public Osoba[] getZnajomi() {
        return znajomi;
    }

    public void setZnajomi(Osoba[] znajomi) {
        this.znajomi = znajomi;
    }

    @Override
     public void wyswietlHistoriePolaczen(){
         System.out.println("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(this.znajomi[i] + super.polaczenia[i] + " ");
        }
        System.out.println("]");
    }
    
}
