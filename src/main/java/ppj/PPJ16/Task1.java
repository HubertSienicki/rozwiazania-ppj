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
public class Task1 {

    public Task1() {
    }
    
    public int[] splitToDigits(int x){
        int[] split;
        int temp = x;
        int nOfDigits = 0;
        
        while(temp > 0){
            nOfDigits += 1;
            temp = temp/10;
        }
        temp = x;
        split = new int[nOfDigits];
        for (int i = split.length - 1; i >= 0; i--) {
            if(temp < 10){
                split[i] = temp;
                break;
            } 
            split[i] = temp%10;
            temp = temp/10;
        }
        return split;
    }
}
