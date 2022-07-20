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
public final class WordDocumentMemento {
    private final long id;
    private final String title;
    private final String heading;
    private final String description;
     
    public WordDocumentMemento(long id, String title, String heading, String description) {
        super();
        this.id = id;
        this.title = title;
        this.heading = heading;
        this.description = description;
    }
 
    public long getId() {
        return id;
    }
 
    public String getTitle() {
        return title;
    }

   public String getHeading() {
        return heading;
    }
 
    public String getDescription() {
        return description;
    }
}
