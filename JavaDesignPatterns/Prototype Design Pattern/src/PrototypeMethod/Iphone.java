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
public class Iphone extends Phones{
    
    private int numberofphotos; 

    public int getNumberofphotos() {
        return numberofphotos;
    }

    public void setNumberofphotos(int numberofphotos) {
        this.numberofphotos = numberofphotos;
    }
    
    @Override
    public String toString() {
        return "Iphone{" + "numberofphotos=" + numberofphotos + '}';
    }


 
   
}
