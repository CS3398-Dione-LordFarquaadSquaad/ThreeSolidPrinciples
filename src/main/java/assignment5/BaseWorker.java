/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Hunter
 */
public class BaseWorker {
    public BaseWorker(String aName, int aID){
        Name = aName;
        ID = aID;
     }
    
    public void setName(String aName){
        Name = aName;
    }
    
    public void setID(int aID){
        ID = aID;
    }
    
    public String getName(){
        return Name;
    }
    
     public int getID(){
        return ID;
    }
     
     public String work(){
        System.out.println("I'm working already!");
        String re = "I'm working already!";
        return re;
     }
    
   protected String Name;
   protected int ID; 
    
}

