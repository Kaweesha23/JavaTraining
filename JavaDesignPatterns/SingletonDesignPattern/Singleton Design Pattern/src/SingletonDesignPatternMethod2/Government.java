/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonDesignPatternMethod2;

/**
 *
 * @author kawee
 */
public class Government {
    private static Government instance;
    
    private Government()
    {
        
    }
    
    public static Government getGovernment()
    {
        if(instance==null)
        {
            instance = new Government();
        }
        return instance;
    }
    
    public void getprint()
    {
        System.out.println("I am a President of Sri Lanka");
    }
}
