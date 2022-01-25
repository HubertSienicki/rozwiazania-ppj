/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ21.TASK2;

/**
 *
 * @author kneiv
 */
public class Basket {
    private String[] basket;
    int index;
    int size;
    
    public Basket(int basketSize) {
        this.basket = new String[basketSize] ;
        this.index = 0;
        this.size = basketSize;
    }
    
    public void put(String team){
        this.basket[index] = team;
        this.index += 1;
    }
    
    public void showBasket(){
        for (int i = 0; i < this.index; i++) {
            System.out.println(this.basket[i]);
        }
    }
}
