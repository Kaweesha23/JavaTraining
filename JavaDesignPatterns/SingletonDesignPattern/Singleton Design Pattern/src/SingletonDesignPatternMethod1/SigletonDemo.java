/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonDesignPatternMethod1;

/**
 *
 * @author kawee
 */
public class SigletonDemo {
    public static void main(String[] args) {
        Government obj1 = Government.getGovernment();
        obj1.print();
        
        Government obj2 = Government.getGovernment();
        obj2.print();
        
    }
}
