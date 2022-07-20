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
public class PhotographyDemo {
    
    public static void main(String[] args) {
        
        Package apackage1= PackageFactory.createPackage(PackageCode.Package1);
        System.out.println(apackage1);
        
        Package apackage2 = PackageFactory.createPackage(PackageCode.Package2);
        System.out.println(apackage2);
        
        Package apackage3 = PackageFactory.createPackage(PackageCode.Package3);
        System.out.println(apackage3);
    }
}
