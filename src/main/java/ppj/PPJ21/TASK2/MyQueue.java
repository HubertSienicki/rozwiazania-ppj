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
public class MyQueue {
    int tab[];
    public int top;
    public int bottom;
    int size;

    public MyQueue(int size) {
        this.tab = new int[size];
        this.top = size - 1;
        this.bottom = size - 1;
        this.size = size;
    }
    
    public void put(int x) {
        if(this.bottom < (0)){
            System.out.println("Queue Overflow");
        }else{
            this.tab[this.bottom] = x;
            this.bottom -= 1;
        }
    }
    
    public int get(){
        if(this.top < (0)){
            System.out.println("Queue underflow");
            return 0;
        }else{
            int x = this.tab[this.top];
            this.top -= 1;
            return x;
        }
    }
}
