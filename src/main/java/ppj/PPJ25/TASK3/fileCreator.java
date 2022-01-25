/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ25.TASK3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author kneiv
 */
public class fileCreator {
    static final String name = "inputData";
    static final String extension = ".txt";
    public fileCreator() {
    }
    
    public void makeFiles(int nOfFiles) throws IOException{
        Random r = new Random();
        int[] temp = new int[10];
        for (int i = 0; i < nOfFiles; i++) {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\kneiv\\Documents\\NetBeansProjects\\ppj\\src\\main\\java\\ppj\\PPJ25\\TASK3\\" + name + i + extension);
            for (int j = 0; j < 10; j++) {
                temp[j] = r.nextInt(10000);
            }
            Arrays.sort(temp);
            for (int j = 0; j < temp.length; j++) {
                fos.write(Integer.toString(temp[j]).getBytes());
                fos.write(32); //Whitespace for clarity
            }
            
        }
    }
}
