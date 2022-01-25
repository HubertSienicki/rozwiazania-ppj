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
public class Task3 {

    public Task3() {
    }
    
    public int iloscPermutacji(int number){
        int temp = number;
        int iloscLiczb = 0;
        int permutacje = 1;
        while(temp > 0){
            temp /= 10;
            iloscLiczb +=1;
        }
        temp = number;
        
        for (int i = 0; i < iloscLiczb; i++) {
            permutacje *= temp % 10;
            temp /= 10;
        }
        return permutacje;
    }
    public void permutations(int number){
        int permutacje = iloscPermutacji(number);
        int temp = number;
        int nOfDigits = 0;
        
        while(temp > 0){
            nOfDigits += 1;
            temp /= 10;
        }
        
        temp = number;
        int[] digits = new int[nOfDigits]; 
        
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        for (int i = 0; i < permutacje; i++) {
            for (int j = 0; j < nOfDigits; j++) {
                System.out.print(digits[j]);
            }
            System.out.println("");
            
        }
    }
}
