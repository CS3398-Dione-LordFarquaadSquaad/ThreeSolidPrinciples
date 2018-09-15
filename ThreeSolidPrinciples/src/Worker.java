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
abstract class Worker extends BaseWorker implements IEat, ISick {
    public Worker(String aName, int aID){
        super(aName, aID); 
    }
    
    public void eat(){
        System.out.println("Here's the typical eat function for Randy:"); 
        System.out.println("Crème fraîche, Cafeteria Fraîche. Lalalalala fraîche. Ho ho hohoho."); 
    }
    
    public void sick(){
        System.out.println("Here's the typical ick function for Randy:"); 
        System.out.println("Just gonna get a little bit of cancer, Stan. Tell Mom it’s okay."); 
    }
    
}
