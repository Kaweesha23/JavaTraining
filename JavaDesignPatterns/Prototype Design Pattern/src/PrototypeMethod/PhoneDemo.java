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
public class PhoneDemo {
    
    public static void main(String[] args) {
        
        Registry R = new Registry();
        
        Iphone ip = (Iphone) R.getPhones(PhoneType.IPHONE);
        System.out.println(ip);
        
        ip.setNumberofphotos(300);
        System.out.println(ip);
        
        Iphone ip1 = (Iphone) R.getPhones(PhoneType.IPHONE);
        System.out.println(ip1);
        
    }
    
    
}
