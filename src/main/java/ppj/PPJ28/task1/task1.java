/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ28.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kneiv
 */
public class task1 {
    public String x;
    public task1(String x) {
        this.x = x;
    }
    
    public void checkExpression(){
        final String regex = "([A-Z]\\.){4}";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.x);
        
        System.out.println(matcher.matches());
    }
}
