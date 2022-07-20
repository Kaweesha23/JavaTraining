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
public class SamsungPhone extends Phones{
    
    private String type;
    
    public String gettype()
    {
        return type;
    }
    
    public void settype(String type)
    {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SamsungPhone{" + "type=" + type + '}';
    }

}
