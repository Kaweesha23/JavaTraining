/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoPattern;

/**
 *
 * @author kawee
 */
public class Main {
    public static void main(String[] args)
    {
        WordDocument document = new WordDocument(1, "My Word Document", "Chapter1");
        document.setContent("ABC");    
        System.out.println(document);
          
        WordDocumentMemento memento = document.createMemento(); 
          
        document.setContent("XYZ");      
        System.out.println(document);
          
        document.restore(memento);       
        System.out.println(document);   
    }
}
