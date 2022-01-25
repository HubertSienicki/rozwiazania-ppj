/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ25.TASK1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author kneiv
 */
public class reader {
    String filePath;
    public reader() {
    }

    public reader(String filePath) {
        this.filePath = filePath;
    }
    
    
    public void readFile(){
        try{
            FileInputStream fls = new FileInputStream(this.filePath);
            
            for (int i = fls.read(); i > -1; i = fls.read()) {
                System.out.print((char)i);
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
