/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ21.TASK1;

/**
 *
 * @author kneiv
 */
public class MyStack {
    Student[] tab;
    public int top;
    int size;

    public MyStack(int size) {
        this.tab = new Student[size];
        this.top = -1;
        this.size = size;
    }
    
    public void push(Student x){
        if(this.top >= (size -1 )){
            System.out.println("Stack overflow");
        }else{
            this.top += 1;
            tab[this.top] = x;
        }
    }
    
    public Student pop(){
        if(this.top < 0){
            System.out.println("Stack underflow");
            return null;
        }else{
            Student x = this.tab[this.top];
            this.top -= 1;
            return x;
        }
    }
    
}
