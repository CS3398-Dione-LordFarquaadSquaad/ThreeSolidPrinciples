package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//package IWork;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunter
 */
public class Member {
    public Member(String aName, int aID){
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
    
   protected String Name;
   protected int ID; 
}
