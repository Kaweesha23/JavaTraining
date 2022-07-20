/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kawee
 */
public abstract class Package {
    
    protected List<Photography> PG= new ArrayList<>();
    
    public Package()
    {
        createPackage();
    }
    
    protected abstract void createPackage();
    
    @Override
    public String toString()
    {
        return "Package("+"Photography ="+ PG +")";
    }
}
