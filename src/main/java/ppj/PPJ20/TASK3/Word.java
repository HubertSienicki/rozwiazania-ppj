/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ20.TASK3;

/**
 *
 * @author kneiv
 */
public class Word {
    char[] tab;
    int currentIndex;

    public Word() {
        tab = new char[100];
        currentIndex = 0;
    }
    
    public void addChar(char x){
        this.tab[currentIndex] = x;
        this.currentIndex ++;
    }
    
    public int length(){
        return tab.length;
    }
    public void show(){
        System.out.print("[");
        for (int i = 0; i < this.length(); i++) {
            System.out.print(tab[i] + ",");
        }
        System.out.print("]");
    }
}
