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
public class Student {
    private int sNumber;
    private String name;

    public Student(int sNumber, String name) {
        this.sNumber = sNumber;
        this.name = name;
    }
    
    public void show(){
        System.out.println("eska: " + this.sNumber);
        System.out.println("Imie: " + this.name);
    }
}
