/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ20.TASK2;

/**
 *
 * @author kneiv
 */
public class Person {
    private String name;
    private int birthYear;
    public Person nextNode;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    
    public Person(String name){
        this.name = name;
        this.birthYear = 1990;
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.birthYear;
    }
    
    public Person getOlder(Person p1, Person p2){
        if(p1.getAge() > p2.getAge()){
            return p1;
        }else{
            return p2;
        }
    }
    
    public Person getOldest(PersonList myList){
        Person temp = myList.head;
        Person current = myList.head;
        while(myList.returnCurrentNode().nextNode != null){
            temp = myList.returnCurrentNode();
            if(current.getAge() < temp.nextNode.getAge()){
                current = temp.nextNode;
                myList.selectNextNode();
            }else{
                myList.selectNextNode();
            }
        }
        return current;
    }
    
}
