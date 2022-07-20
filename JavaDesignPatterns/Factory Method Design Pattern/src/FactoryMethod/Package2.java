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
public class Package2 extends Package {

    @Override
    protected void createPackage() {
      PG.add(new PreShootPhotography());
      PG.add(new EngagementPhotography());
    }
    
}
