/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ27.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kneiv
 */
public class numberPair {
    public String x; 
    public numberPair() {
        x = "wies w Polsce polozona w wojewodztwie wielkopolskim, w powiecie kolskim, w gminie Olszowka. W latach 1975-1998 miejscowosc polozona byla w wojewodztwie koninskim.";
    }
    
    public void checkNumberPairs(){
        final String regex = "(?!\\\\d[0-9])[0-9]{2}";
        final String string = "wies w Polsce polozona w wojewodztwie wielkopolskim, w powiecie kolskim, w gminie Olszowka. W latach 1975-1998 miejscowosc polozona byla w wojewodztwie koninskim.";
        
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            

        }
    }
}
