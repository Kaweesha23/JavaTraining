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
public class DivideNumbers implements Chain{
    private Chain nextInChain;

  
    @Override
    public void setNextChain(Chain nextChain)
    {
        nextInChain = nextChain;
    }
    
   
    @Override
    public void calculate(Number request)
    {
        if(request.getCalcwanted() == "div")
       {
           System.out.println(request.getNumber1()+ "/"+ request.getNumber2()+"="+(request.getNumber1()/request.getNumber2()));
       }
       else
       {
           System.out.println("Only Works for add, sub, mult, and div");
       }
    }
}
