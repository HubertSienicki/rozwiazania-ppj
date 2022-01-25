/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ16;

/**
 *
 * @author kneiv
 */
public class Task5 {

    public Task5() {
    }
 
    public static int[][] tablica(int[][] tab, int x, int y, int z){
        if((x == 8 && y == 0)){
            for (int i = x; i < tab.length; i++) {
                    for (int j = y; j < tab[i].length - y; j++) {
                        tab[i][j] = z;
                    }
                }
            return tab;
        }
        
        if(x >= (tab.length) / 2){
            if(tab[x-1][y - 1] <  z){
                for (int i = x; i < tab.length; i++) {
                    for (int j = y; j < tab[i].length - y; j++) {
                        tab[i][j] = z;
                    }
                }
                return tablica(tab, x+1, y-1, z-1);
            }
        }
        
        else 
            for (int i = x; i < tab.length; i++) {
                for (int j = y; j < tab[i].length - y; j++) {
                    tab[i][j] = z;
                }
            }
        return tablica(tab, x+1, y+1, z+1);

    } 
}



 