/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityPattern;

/**
 *
 * @author kawee
 */
public class NumberDemo {
    
    public static void main(String[] args) {
        
        Chain cc1 = new AddNumbers();
        Chain cc2 = new SubtractNumbers();
        Chain cc3 = new MultNumbers();
        Chain cc4 = new DivideNumbers();
        
        cc1.setNextChain(cc2);
        cc2.setNextChain(cc3);
        cc3.setNextChain(cc4);
        
        
        Number request = new Number(4,2, "mult");
        
        cc1.calculate(request);
    }
}
