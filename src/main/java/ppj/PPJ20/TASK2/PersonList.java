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
public class PersonList {
    public Person head;
    private Person currentNode;

    public PersonList(Person p1) {
        this.head = p1;
        this.currentNode = head;
    }
    
    public void show(){
        while(currentNode != null){
            System.out.print("[" + currentNode.getName() + ", " + currentNode.getAge() + "] -> " );
            currentNode = currentNode.nextNode;
        }
        currentNode = head;
    }
    
    public void selectNextNode(){
        currentNode = currentNode.nextNode;
    }
    
    public Person returnCurrentNode(){
        return this.currentNode;
    }
}
