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
public class Government {
    
    private static Government instance = new Government();
    
    private Government()
    {
        
    }
    
    public static Government getGovernment()
    {
        return instance;
    }
    
    public void print()
    {
        System.out.println("I am a President of Sri Lanka");
    }
}
