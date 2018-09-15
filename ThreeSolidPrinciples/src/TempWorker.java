/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import assignment5.interfaces.IEat;
import assignment5.interfaces.ISick;
/**
 *
 * @author Hunter
 */
abstract class TempWorker extends BaseWorker {
    public TempWorker(String aName, int aID){
        super(aName, aID);
    }
    
    public void eat(){
        System.out.println("Here is the Temp eat Function:");
        System.out.println("I like Beef Jerkey"); 
    }
    
    public void sick(){
        System.out.println("Here is the Temp Sick Function:");
        System.out.println("I am sick and tired of these stubborn customers"); 
    }
    
    @Override
    public void work(){
        System.out.println("Here is the Temp Worker Function:");
        System.out.println("I'm just here so I won't get fined"); 
    }
}