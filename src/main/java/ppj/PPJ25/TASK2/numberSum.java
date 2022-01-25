/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ25.TASK2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author kneiv
 */
public class numberSum {

    public numberSum() {
    }
    
    public void sumNumbers(){
        try{
            FileInputStream fls = new FileInputStream("C:\\Users\\kneiv\\Documents\\NetBeansProjects\\ppj\\src\\main\\java\\ppj\\PPJ25\\TASK2\\zad1.txt");
            int sum = 0;
            for (int i = fls.read(); i > -1; i = fls.read()) {
                if(i == 32){ //Whitespace skip
                    i = fls.read();
                }else{
                    sum+= i;
                }
            }
            System.out.println((int)sum);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
