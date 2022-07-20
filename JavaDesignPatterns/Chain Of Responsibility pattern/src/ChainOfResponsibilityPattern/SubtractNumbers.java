/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityPattern;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;

/**
 *
 * @author kawee
 */
public class SubtractNumbers implements Chain{
    
    private Chain nextInChain;
    
    @Override
    public void setNextChain(Chain nextChain)
    {
        nextInChain = nextChain;
    }
    
    @Override
    public void calculate(Number request)
    {
        if(request.getCalcwanted() == "sub")
       {
           System.out.println(request.getNumber1()+ "-"+ request.getNumber2()+"="+(request.getNumber1()-request.getNumber2()));
       }
       else
       {
           nextInChain.calculate(request);
       }
    }
}
