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
public class Task6 {

    public Task6() {
    }
    
    public int[] bubbleSortRe(int[] tab, int y){
        System.out.println(y);
        if(y == 1){
            return tab;
        }else{
            for (int i = 0; i < y; i++) {
                if(tab[i] > tab[i + 1]){
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i+1] = temp;
                }
            }
            return bubbleSortRe(tab, y-1);
        }

    }
}