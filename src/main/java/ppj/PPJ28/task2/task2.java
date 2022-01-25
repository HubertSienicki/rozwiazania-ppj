/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ28.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author kneiv
 */
public class task2 {

    public task2() {
    }
    
    public void toNumberConversion(){
        try{
            int num;
            try (FileInputStream fls = new FileInputStream("C:\\Users\\kneiv\\Documents\\NetBeansProjects\\ppj\\src\\main\\java\\ppj\\PPJ28\\task2\\data.txt")) {
                num = 0;
                for (int i = 30; i >= 0; i--) {
                    int digit = fls.read() - '0';
                    num += Math.pow(2 * digit, i);
                }
            }
            System.out.println(num);
            
            try (FileOutputStream fos = new FileOutputStream("C:\\Users\\kneiv\\Documents\\NetBeansProjects\\ppj\\src\\main\\java\\ppj\\PPJ28\\task2\\output.bin")) {
                for (int i = 3; i >= 0; i--) {
//                fos.write(num >> (3*8));
//                fos.write(num >> (2*8));
//                fos.write(num >> (1*8));
//                fos.write(num >> (0*8));
                    fos.write(i >> (i*8));
                }
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
