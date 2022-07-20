/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kawee
 */
public class Registry {
     private Map<PhoneType, Phones> phones = new HashMap<>();

    public Registry() {
        
        this.initialize();
    }
    
    
    public Phones getPhones(PhoneType PT)
    {
        Phones P= null;
         try {
             P =(Phones) phones.get(PT).clone();
         } catch (CloneNotSupportedException ex) {
             ex.printStackTrace();
         }
         return P;
    }

    private void initialize() {
        
        SamsungPhone sam = new SamsungPhone();
        sam.settype("Galaxy");
        sam.setStorage(32);
        
        Iphone ip = new Iphone();
        ip.setNumberofphotos(200);
        ip.setStorage(256);
        
        phones.put(PhoneType.SAMSUNG, sam);
        phones.put(PhoneType.IPHONE, ip);
    }
     
     
}
