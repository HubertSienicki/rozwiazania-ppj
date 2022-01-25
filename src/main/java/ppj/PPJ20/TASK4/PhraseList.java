/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppj.PPJ20.TASK4;

/**
 *
 * @author kneiv
 */
public class PhraseList {
    public Phrase head;
    private Phrase currentNode;
    private int size;

    public PhraseList() {
        this.head = null;
        this.currentNode = head;
    }
    
    public void show(){
        while(currentNode != null){
            System.out.print(currentNode.word + " -> ");
            currentNode = currentNode.nextNode;
        }
    }
    
    public void addWordAtEnd(String word){
        Phrase nextPhrase = new Phrase(word);
        this.currentNode = nextPhrase;
    }
}
