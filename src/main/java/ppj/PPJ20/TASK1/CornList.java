/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ20.TASK1;

/**
 *
 * @author kneiv
 */
public class CornList {
    Corn head;
    Corn currentNode;

    public CornList(Corn head) {
        this.head = head;
        this.currentNode = head;
    }
    
    public void show(){
        while(currentNode != null){
            System.out.print("[" + currentNode.cornCount + "]" + " -> ");
            currentNode = currentNode.nextNode;
        }
        currentNode = this.head;
    }
    
    
}
