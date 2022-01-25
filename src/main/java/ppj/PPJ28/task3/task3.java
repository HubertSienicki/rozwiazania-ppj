/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ28.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kneiv
 */
public class task3 {
    private final String IPV4REGEX = "(\\d{1,3}\\.){3}\\d{1,3}";
    
    public task3() {
    
    }
    
    public void translateAddresses(){
        try{
            Pattern ipv4Pattern = Pattern.compile(this.IPV4REGEX);
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kneiv\\Documents\\NetBeansProjects\\ppj\\src\\main\\java\\ppj\\PPJ28\\task3\\serverLog.txt"));
            int ipCounter = 0;
            
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                Matcher ipv4 = ipv4Pattern.matcher(line);
                while(ipv4.find()){
                    String[] tokens = ipv4.group().split("\\.");
                    int[] elements = new int[tokens.length];
                    for (int i = 0; i < tokens.length; i++) {
                        elements[i] = Integer.parseInt(tokens[i]);
                    }
                    boolean isInRange = true;
                    for(int element : elements){
                        if(element > 255) isInRange = false;
                    }
                    
                    if(isInRange){
                        for (int i = 0; i < tokens.length; i++) {
                            tokens[i] = Integer.toHexString(elements[i]);
                        }
                        String hexIPv4 = String.join(":", tokens);
                        System.out.println(++ipCounter + " " + hexIPv4);
                    }
                }
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
