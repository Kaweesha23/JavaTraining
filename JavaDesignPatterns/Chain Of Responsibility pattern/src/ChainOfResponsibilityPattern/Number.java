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
public class Number {
     private int number1;
     private int number2;
     
     private String calculationWanted;
     
     public Number(int newNumber1, int newNumber2, String calcWanted)
     {
         number1 = newNumber1;
         number2 = newNumber2;
         calculationWanted = calcWanted;
     }
     
     public int getNumber1()
     {
         return number1;
     }
     
     public int getNumber2()
     {
         return number2;
     }
     public String getCalcwanted()
     {
         return calculationWanted;
     }
}
