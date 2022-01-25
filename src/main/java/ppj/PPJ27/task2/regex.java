/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ27.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kneiv
 */
public class regex {
    String phrase;
    
    public regex(String phrase) {
        this.phrase = phrase;
    }
    
    public boolean isHex(){
        boolean flag = false;
        Pattern pattern = Pattern.compile("(?!0000)[0-9A-F]{4}");
        
        Matcher matcher = pattern.matcher(this.phrase);
        
        flag = matcher.matches();
        return flag;
    }
    
}
