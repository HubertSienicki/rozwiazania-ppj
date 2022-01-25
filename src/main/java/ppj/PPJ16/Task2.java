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
public class Task2 {

    public Task2() {
    }
    
    public boolean isArmstrongNumber(int x){
        boolean flag = true;
        int temp = x;
        int nOfDigits = 0;
        int[] split;
        
        while(temp > 0){
            temp /= 10;
            nOfDigits += 1;
        }
        
        temp = x;
        split = new int[nOfDigits];
        
        for (int i = split.length - 1; i >= 0; i--) {
            split[i] = temp%10;
            temp /= 10;
        }
        
        int sum = 0;
        
        for (int i = 0; i < split.length; i++) {
            sum += Math.pow(split[i], nOfDigits);
        }
        
        System.out.println( "number: " + x + "\n" +
                            "number of Digits: " + nOfDigits + " \n" +
                            "sum: " + sum);
        return sum == x;
        
        
    }
}
