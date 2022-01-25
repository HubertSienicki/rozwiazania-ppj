/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ17;

/**
 *
 * @author kneiv
 */
public class Task5 {

    public Task5() {
    }
    
    public int[] bubbleSort(int[] tab){
        int y = tab.length - 1;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < y; j++) {
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
            y--;
        }
        return tab;
    }
}
