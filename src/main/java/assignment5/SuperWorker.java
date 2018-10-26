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
abstract class SuperWorker extends BaseWorker {
    public SuperWorker(String aName, int aID){
        super(aName, aID);
    }
    
    public void eat(){
        System.out.println("Here's the eat function for PC Principal"); 
        System.out.println("You PC Bro?"); 
    }
    
    public void sick(){
        System.out.println("Here's the sick function for PC Principal"); 
        System.out.println("Alright everyone listen up! PC Principal DOES NOT"
                + "GET SICK!!!"); 
    }
    
    @Override
    public String work(){
        System.out.println("Here's the work function for PC Principal"); 
        System.out.println("We are at war, but the only way to win this war "
                + "is to be as understanding, non-biased and politically correct as possible."); 
        String re = "I'm working already!";
        return re;
    }
}
