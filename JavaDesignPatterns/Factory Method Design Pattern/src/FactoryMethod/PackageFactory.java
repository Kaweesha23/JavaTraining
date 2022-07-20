/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author kawee
 */
public class PackageFactory {
    
    public static Package createPackage(PackageCode packageCode)
    {
        switch(packageCode)
        {
            case Package1:
                return new Package1();
            case Package2:
                return new Package2();
            case Package3:
                return new Package3();
            default:
                return null;
        }
    }
    
}
