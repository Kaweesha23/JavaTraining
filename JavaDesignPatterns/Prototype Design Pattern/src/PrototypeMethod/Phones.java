/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeMethod;

/**
 *
 * @author kawee
 */
public abstract class Phones implements Cloneable{
    
    private int Storage;

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int Storage) {
        this.Storage = Storage;
    }
    
    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
