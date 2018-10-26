/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import assignment5.interfaces.IReboot;
/**
 *
 * @author Hunter
 */
abstract class Robot extends BaseWorker implements IReboot {
    public Robot(String aName, int aID){
        super(aName, aID);
    }
    
    public void reboot(){
        System.out.println("Here's the typical reboot function"); 
        System.out.println("Greetings, I am the A.W.E.S.O.M.-O 4000"); 
    }
    
}
