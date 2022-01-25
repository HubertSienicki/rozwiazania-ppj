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
public class Task4 {

    public Task4() {
    }
 
    
    public boolean isPalindrome(char[] word, int x, int y){
        if(x == word.length - 1){
            return true;
        }else if(word.length == 0 || word.length == 1){
            return true;
        }else if(word[x] != word[y]){
            return false;
        }else{
            return isPalindrome(word, x+1, y-1);
        }        
    }
}
