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
            String temp = "";
            
            for (int i = fls.read(); i > -1; i = fls.read()) {
                if(i == -1){
                    sum += Integer.parseInt(temp);
                }else{
                    if(i == 32){ //Whitespace check
                        sum += Integer.parseInt(temp);
                        temp = "";
                    }else{
                        temp += (char)i;
                        System.out.println(temp);
                    }
                }
            }
            sum += Integer.parseInt(temp);
            System.out.println("Suma: " + (int)sum);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
