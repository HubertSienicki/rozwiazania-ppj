/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ppj.PPJ16.Task1;
import ppj.PPJ16.Task2;
import ppj.PPJ16.Task4;
import ppj.PPJ17.Task5;
import ppj.PPJ17.Task6;
import ppj.PPJ20.TASK1.Corn;
import ppj.PPJ20.TASK1.CornList;
import ppj.PPJ20.TASK2.Person;
import ppj.PPJ20.TASK2.PersonList;
import ppj.PPJ20.TASK3.Word;
import ppj.PPJ20.TASK4.Phrase;
import ppj.PPJ20.TASK4.PhraseList;
import ppj.PPJ21.TASK1.MyStack;
import ppj.PPJ21.TASK1.Student;
import ppj.PPJ21.TASK2.Basket;
import ppj.PPJ21.TASK2.MyQueue;
import ppj.PPJ22.TASK1.Graniastoslup;
import ppj.PPJ22.TASK1.Ostroslup;
import ppj.PPJ22.TASK1.Prostokat;
import ppj.PPJ22.TASK1.Prostopadloscian;
import ppj.PPJ22.TASK1.Trojkat;
import ppj.PPJ22.TASK3.CiagnikSiodlowy;
import ppj.PPJ23.TASK1.Drzewo;
import ppj.PPJ22.TASK5.DrzewoOwocowe;
import ppj.PPJ27.task2.regex;
import ppj.PPJ27.task4.numberPair;
import ppj.PPJ28.task1.task1;
import ppj.PPJ28.task2.task2;

/**
 *
 * @author kneiv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        Corn c1 = new Corn(1);
//        Corn c2 = new Corn(2);
//        Corn c3 = new Corn(3);
//        Corn c4 = new Corn(4);
//        Corn c5 = new Corn(5);
//        
//        c1.nextNode = c2;
//        c2.nextNode = c3;
//        c3.nextNode = c4;
//        c4.nextNode = c5;
//        
//        CornList list = new CornList(c1);
//        
//        list.show();
//        
        
//        
//        
//        CornList myList = new CornList(corn1);
//        
//        myList.makePopcorn();
//    
//      Person p1 = new Person("Hubert", 19);
//      Person p2 = new Person("Robert", 95);
//      Person p3 = new Person("Michal", 1902);
//      Person p4 = new Person("Monika", 75);
//      
//      p1.nextNode = p2;
//      p2.nextNode = p3;
//      p3.nextNode = p4;
//      
//      PersonList myList = new PersonList(p1);
//      
//      myList.show();
//      
//      System.out.println("");
//      System.out.println(p1.getOlder(p1, p2).getAge());
//      
//        System.out.println(p1.getOldest(myList).getAge());
//
//        Word w1 = new Word();
//        w1.addChar('s');
//        w1.addChar('d');
//        w1.addChar('u');
//        w1.addChar('p');
//        w1.addChar('a');
//        
//        w1.show();
//
//        Phrase p1 = new Phrase("We");
//        Phrase p2 = new Phrase("the");
//        Phrase p3 = new Phrase("people");
//        
//        Phrase[] table = new Phrase[3];
//        table[0] = p1;
//        table[1] = p2;
//        table[0] = table[1];
//        System.out.println(table[0].word);
//        table[0].returndupa();
//        System.out.println(table[0].dwanascie());
//        
//        p1.nextNode = p2;
//        p2.nextNode = p3;
//        
//        PhraseList myList = new PhraseList(p1);
//        myList.show();
//        
//        myList.addWordAtEnd("LMAO XD");
//        myList.show();
//        
//        myList.addWordAtEnd("Twoja stara zapierdala");
//        myList.show();
//
//    Student s1 = new Student(25189, "Hubert");
//    Student s2 = new Student(21451, "Robert");
//    Student s3 = new Student(21282, "Michal");
//    Student s4 = new Student(25718, "Pawel");
//    
//    MyStack stack = new MyStack(3);
//    stack.push(s1);
//    stack.push(s2);
//    stack.push(s3);
//    stack.push(s4);
//    stack.pop().show();
//    stack.pop().show();
//    stack.pop().show();
//    stack.pop();
//    
//    System.out.println("BASKET A: ");
//    Basket A = new Basket(8);
//    A.put("PSG");
//    A.put("Atletico Madrid");
//    A.put("Sporting CP");
//    A.put("Inter");
//    A.put("Benfica");
//    A.put("Villareal");
//    A.put("RB Salzburg");
//    A.put("Chelsea");
//    
//    A.showBasket();
//    
//    System.out.println("");
//    
//    System.out.println("BASKET B: ");
//    Basket B = new Basket(8);
//    B.put("Manchester City");
//    B.put("Liverpool");
//    B.put("Ajax Amsterdam");
//    B.put("Real Madryt");
//    B.put("Bayern Monachium");
//    B.put("Manchester United");
//    B.put("Lille");
//    B.put("Juventus");
//    
//    B.showBasket();
//    
//    MyQueue queue = new MyQueue(3);
//    queue.put(3);
//    queue.put(5);
//    queue.put(4);
//    System.out.println(queue.get());
//        System.out.println(queue.get());
//        System.out.println(queue.get());
//        System.out.println(queue.get());
//
//    Prostopadloscian p1 = new Prostopadloscian(5,8,4);
//    
//    Prostokat prostokat = new Prostokat(2,4);
//    
//    Ostroslup o1 = new Ostroslup(prostokat, 8);
//    
//    Graniastoslup g1 = new Graniastoslup(prostokat, 3);
//    
//    
//    System.out.println("Pole prostopadloscianu : " + p1.returnArea() + 
//                        "\n" + "Pole Ostroslupa: " + o1.returnArea() + 
//                        "\n" + "Pole Graniastoslupa: " + g1.returnArea());
//        
//    
//    CiagnikSiodlowy cs = new CiagnikSiodlowy(33, 4, "Czerwony");
//    
//    cs.rozpocznijJazde();
//        
//    DrzewoOwocowe dO = new DrzewoOwocowe("Jab?ko", 14, true, 156, "14");
//    
//        System.out.println(dO.toString());
//    
//    Drzewo drzewo = new Drzewo();
//    drzewo.zerwijOwoc();
//        
//    Task1 task = new Task1();
//    
//    System.out.println(Arrays.toString(task.splitToDigits(2521216)));
//
//    Task2 task = new Task2();
//    System.out.println(task.isArmstrongNumber(153));
//
//    char[] word = {'k', 'j', 'a', 'a', 'k'};
//    Task4 task = new Task4();
//        System.out.println(task.isPalindrome(word, 0, word.length - 1));
//    int[][] tab = new int[8][8];
//    Task5 task = new Task5();
//    
//    task.tablica(tab, 0, 0, 1);
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab[i].length; j++) {
//                System.out.print(tab[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    
//
//    int[] tab = {2,8,12,3,7,1,9,32,5,9,5,84,13,7,8,127,8,3,124,8,453,3,2,6};
//    Task5 task5 = new Task5();
//    
//        System.out.println(Arrays.toString(task5.bubbleSort(tab)));

//    Task6 task = new Task6();
//    
//    task.bubbleSortRe(tab, tab.length - 1);
//    
//    
//    for (int i = 0; i < tab.length; i++) {
//            System.out.print(tab[i] + " ");
//    }

//        regex regular = new regex("FFFF");
//        System.out.println(regular.isHex());
        
//        numberPair np = new numberPair();
//        np.checkNumberPairs();

//    task1 string = new task1("A.B.Z.F.");
//    string.checkExpression();

    task2 checker = new task2();
    checker.toNumberConversion();
    
    }
    
}
